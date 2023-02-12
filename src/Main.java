import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100));
        machine.addProduct(new Product("Mars", 70));
        machine.addProduct(new Product("Twix", 70.99));
        machine.addProduct(new Product("Алёнка", 90));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Коровка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Василёк", 85, new Date(2023, 1, 25)));
        machine.addProduct(new confectionery("Торт", 500, new Date(2023, 1, 15)));
        machine.addProduct(new confectionery("Пряники", 350, new Date(2023, 1, 20)));



       // System.out.println("__________________________________");
       // System.out.println(machine.findProduct("Молоко"));
      //  System.out.println(machine.findProduct("Алёнка"));
       // System.out.println(machine.findProduct("Alenka"));
      //  System.out.println("__________________________________");
        //System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
       // System.out.println("__________________________________");
        System.out.println(machine);


    }
}


//На основе кода с урока добавить еще один класс продукта, (Молоко, шоколад ,и т.п., можно добавить несколько классов),
// они должны наследоваться от класса Product, надо переопределить метод toString
// и попробовать включить эти классы в VendingMachine, вывести список товаров из VendingMachine