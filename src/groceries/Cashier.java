package groceries;

import groceries.Basket;
import groceries.Bundle;
import groceries.Item;

public class Cashier {

	private static Item item1 = new Item("Fruit", 2);
	private static Item item2 = new Item("Savon", 4);
	private static Bundle item3 = new Bundle("Jus d'Orance", 3, 4);

	private static Object[] groceryList = { item1, item2, item3 };

	private static Basket basket = new Basket(groceryList);

	public static void main(String[] args) {
		checkoutBasket(basket);
	}

	public static void checkoutBasket(Basket basketInstance) {
		System.out.println("You got " + basketInstance.getTotalCount() + " items, for a total of "
				+ basketInstance.getTotalPrice() + "€");
	}

}
