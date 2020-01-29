import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {

	ArrayList<Item> inventory = new ArrayList<>();

	Scanner input = new Scanner(System.in);

	public void addItem() {
		System.out.println("Unesi id:");
		int id = input.nextInt();
		System.out.println("Unesi ime:");
		String ime = input.next();
		System.out.println("Unesi kolicinu:");
		int kolicina = input.nextInt();
		System.out.println("Unesi cijenu:");
		double cijena = input.nextDouble();

		inventory.add(new Item(id, ime, kolicina, cijena));

	}

	public void removeItem() {
		System.out.println("Unesite id:");
		int id = input.nextInt();

		for (Item e : inventory) {
			if (e.getId() == id) {
				inventory.remove(e);
			}
		}
	}
}
