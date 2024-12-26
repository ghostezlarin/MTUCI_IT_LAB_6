import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        //импорт текстового файла
        String filePath = "C:\\Users\\pavel\\IdeaProjects\\Laba6\\src\\test.txt";
        File file = new File(filePath);

        //создаем словарь, где ключ String, а Integer значение
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;//декларуем переменную строку
            //пока строка не пустая, добавляем слова в массив строк
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                //перебираем по массиву элементы и добавляем его в словарь
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); // если слово не пустое оно добавляется в коллекцию
                        // (если встретилось первый раз то деволтное значение если нет то +1)
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("ошибка" + e.getMessage());
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet()); // список из элементов Map

        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue())); // сортируем список по убванию при помощи лямбда выражений


        System.out.println("Топ-10 самых часто встречающихся слов:");
        for (int i = 0; i < Math.min(999999999, list.size()); i++) {
            System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
        }
    }
}
