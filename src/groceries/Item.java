package groceries;

public class Item {
	private int price;
	private String name;

	public Item(String inputName, int price) {
		super();
		this.price = price;
		this.name = inputName;
	}

	public static void main(String[] args) {
		System.out.println(tagMe());
	}

	private static String tagMe() {
		return "Je suis un Item, je vais dans un Basket et je passe en Cashier";
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
}
