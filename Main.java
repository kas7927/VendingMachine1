import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine(6, 6, 6);
        vendingMachine.addProduct(0,0,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(0,1,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(0,2,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(0,3,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(0,4,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(0,5,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(1,0,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(1,1,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(1,2,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(1,3,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(1,4,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(1,5,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(2,0,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(2,1,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(2,2,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(2,3,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(2,4,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(2,5,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(3,0,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(3,1,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(3,2,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(3,3,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(3,4,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(3,5,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(4,0,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(4,1,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(4,2,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(4,3,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(4,4,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(4,5,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(5,0,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(5,1,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(5,2,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(5,3,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(5,4,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");
        vendingMachine.addProduct(5,5,6, ThingsinVM.SODA, "200 Calories, 3Grams Fat, 45 Carbs");

        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Available items: ");
        System.out.println(vendingMachine.getProduct(0,0,6, ThingsinVM.SODA));

        System.out.println("\n Getting products from vending machine: ");


        vendingMachine.display();

        double[] price = {2.00};
        String[] products = {"soda"};

        for (int i = 0; i < products.length; i++){
            System.out.println(i + 1 + ". " + products[i] + "- $" + price[i]);
        }

        double totalAmount = 0.0;

        while(true) {

            System.out.print("Enter the item number (1-" + products.length + ") or 0 to exit: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice < 1 || choice > products.length) {
                System.out.println("Invalid choice. Please try again.");

            } else {
                int selectedItemIndex = choice -1;
                String selectedItem = products[selectedItemIndex];
                double productPrice = price[selectedItemIndex];

                System.out.println("You selected: " + selectedItem);
                System.out.println("Price: $" + productPrice);

                System.out.print("Insert coins (e.g., 1.00 for $1.00): $");
                double payment = scanner.nextDouble();

                if (payment < productPrice) {
                    System.out.println("Insufficient payment. Please insert more coins.");
                } else {

                    System.out.println("Dispensing " + selectedItem);
                    totalAmount += productPrice;
                    double change = payment - productPrice;
                    if (change > 0) {
                        System.out.println("Change: $" + change);
                    }
                }
            }

            System.out.println("Thank you for using the Vending Machine!");
            System.out.println("Total amount earned: $" + totalAmount);
        }
    }
}