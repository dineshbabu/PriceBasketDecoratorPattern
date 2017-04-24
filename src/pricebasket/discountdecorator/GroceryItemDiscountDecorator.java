package pricebasket.discountdecorator;

import pricebasket.GroceryItem;

public abstract class GroceryItemDiscountDecorator extends GroceryItem {
	public abstract String getDiscountDescription();
}