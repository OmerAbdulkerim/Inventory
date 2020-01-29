import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        menu();
    }

    static void menu(){
        System.out.println("1) Create object: " + "\n2) Update item: " + "\n3) Remove item: "
        + "\n4) List all items: ");

        Scanner input = new Scanner((System.in));

        switch (input){
            case 1:
                System.out.println("Input object id: ");
                int id = input.nextInt();
                System.out.println("Input name of the object: ");
                String name = input.next();
                System.out.println("Input quantity of object: ");
                int quantity = input.nextInt();
                System.out.println("Input price of the object: ");
                double price = input.nextDouble();
                Item item = new Item(id, name, quantity, price);
                ItemManager.addItem(item);
                break;
            case 2:
                ItemManager.updateItem(item);
                menu();
                break;
            case 3:
                ItemManager.removeItem(item);
                menu();
                break;
            case 4:
                ItemManager.listAllItems(item);
                menu();
                break;
            default:
                System.out.println("Wrong input, please try again");
                menu();
                break;
        }
    }


}
