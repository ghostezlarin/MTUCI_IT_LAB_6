public class Product {
    //создаем название товара и цену
    private String name;
    private double price;

    // Конструктор
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getter
    public String getName() {
        return name;
    }
    //getter
    public double getPrice() {
        return price;
    }
    //переопределение
    @Override
    public String toString() {
        return "Название: " + name + ", Цена: " + price;
    }
}