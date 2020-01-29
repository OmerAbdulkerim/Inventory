import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        menu();
    }

    static void menu(){
        System.out.println("0) Create object: " + "\n1) Add item" + "\n2) Update item: " + "\n3) Remove item: "
        + "\n4) List all items: ");

        Scanner input = new Scanner((System.in));

        switch (input){
            case 0:
                ItemManager.createItem();
                break;
            case 1:
                System.out.println("Insert object id");
                int id = input.nextInt();
                ItemManager.increaseQuantity(id);
                menu();
                break;
            case 2:
                ItemManager.updateItem();
                menu();
                break;
            case 3:
                ItemManager.removeItem();
                menu();
                break;
            case 4:
                ItemManager.listAllItems();
                menu();
                break;
            default:
                System.out.println("Wrong input, please try again");
                menu();
                break;
        }
    }


}
