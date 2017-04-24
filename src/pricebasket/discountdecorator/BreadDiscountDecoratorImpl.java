package pricebasket.discountdecorator;

import pricebasket.GroceryItem;

public class BreadDiscountDecoratorImpl extends GroceryItemDiscountDecorator {

	GroceryItem groceryItem;
	private final double DISCOUNT_PERCENTAGE = 50.00;
	double discount;

	public BreadDiscountDecoratorImpl(GroceryItem groceryItem){
		this.groceryItem = groceryItem;
		if(getSoupCount() >= 2) {
			discount = COST_OF_BREAD * DISCOUNT_PERCENTAGE / 100;
			setSoupCount(soupCount - 2);
		}
	}

	@Override
	public String getItemDescription() {
		return groceryItem.getItemDescription();
	}

	@Override
	public double getCost() {
		return groceryItem.getCost() - discount ;
	}

	@Override
	public String getDiscountDescription() {
		StringBuilder discountDescription = new StringBuilder();
		if(discount > 0) {
			discountDescription.append("\nBread "+ DISCOUNT_PERCENTAGE + "% off : -£" + discount );
		}
		return discountDescription.append(groceryItem.getDiscountDescription()).toString();
	}

}
