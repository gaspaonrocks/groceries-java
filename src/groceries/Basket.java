package groceries;

import groceries.Bundle;
import groceries.Item;

public class Basket {

	private int totalPrice = 0;
	private int totalCount = 0;

	public Basket(Object[] list) {
		super();
		listItems(list);
	}

	private void listItems(Object[] list) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] instanceof Bundle) {
				totalPrice += ((Bundle) list[i]).getPrice();
				totalCount += ((Bundle) list[i]).getCount();
			} else if (list[i] instanceof Item) {
				totalPrice += ((Item) list[i]).getPrice();
				totalCount++;
			}
		}
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public int getTotalCount() {
		return totalCount;
	}
}
