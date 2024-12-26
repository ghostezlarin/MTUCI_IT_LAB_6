//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack size : " + stack.getSize());

        System.out.println("Delete and print high : " + stack.pop());
        System.out.println("Get high element : " + stack.peek());
        stack.push(4);
        System.out.println("Delete and get high element : " + stack.pop());


        System.out.println("/////////////");

        SalesTracker salesTracker = new SalesTracker();

        salesTracker.addProduct(new Product("Test1", 150));
        salesTracker.addProduct(new Product("Test2", 120));
        salesTracker.addProduct(new Product("Test3", 150));
        salesTracker.addProduct(new Product("Test4", 220));

        salesTracker.showSoldProducts();
        System.out.println("Общая сумма продаж: " + salesTracker.getTotalSales());


        System.out.println("наиболее популярный2 : " + salesTracker.getMostPopularProduct());
        }
}
