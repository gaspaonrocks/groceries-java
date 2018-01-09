package groceries;

public class Item {
	private int price;
	private String name;

	public Item(String inputName, int price) {
		super();
		this.price = price;
		this.name = inputName;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
}
