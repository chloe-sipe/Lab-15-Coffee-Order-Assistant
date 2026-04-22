import java.util.Scanner;

class Order{
    String drinkName;
    double basePrice;

    Order(String dn, double bp){
        drinkName = dn;
        basePrice = bp;
    }

    void printBill(){
        Scanner input = new Scanner(System.in);
        System.out.print("Are you a member (Y/N)?");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("y")){
            double finalPrice = basePrice * 0.9;
            System.out.println("---RECIEPT---");
            System.out.println("Drink: " + drinkName + "\nBase Price: $" + basePrice + "\nYou got a 10% discount! \nFinal Price: $" + finalPrice);
        }else{
            System.out.println("---RECIEPT---");
            System.out.println("Drink: " + drinkName + "\nPrice: $" + basePrice);
        }

    }

}

public class Main {
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        double basePrice = 0;

        System.out.println("--- MENU---");
        System.out.println("1. Espresso - $3.50 \n2. Latte - $4.50 \n3. Cappuccino - $5.00");
        System.out.print("What would you like to order? (1-3)");
        int drink = order.nextInt();

        switch(drink){
            case 1:
                Order order1 = new Order("Espresso", 3.50);
                order1.printBill(); break;
            case 2:
                Order order2 = new Order ("Latte", 4.50);
                order2.printBill(); break;
            case 3:
                Order order3 = new Order("Cappuccino", 5);
                order3.printBill(); break;
            default: System.out.println("Invalid option!");
        }

    }
}