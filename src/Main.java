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
            case 0:
                System.out.println("Unesite id objekta: ");
                int id = input.nextInt();
                System.out.println();
            case 1:
                ItemManager.additem();
                menu();
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
