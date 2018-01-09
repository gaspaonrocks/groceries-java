package groceries;

public class Bundle {
	private String name;
	private int totalPrice;
	private int itemsCount;

	public Bundle(String name, int unitPrice, int number) {
		super();
		this.name = name;
		this.totalPrice = unitPrice * number;
		this.itemsCount = number;
	}

	public int getPrice() {
		return this.totalPrice;
	}

	public int getCount() {
		return this.itemsCount;
	}

	public String Getname() {
		return name;
	}

	public static void main(String[] args) {
		System.out.println("Je suis un bundle, je vais dans un Basket et je passe en Cashier");
	}
}
