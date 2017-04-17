package pricebasket;

public class ApplesDiscountDecoratorImpl extends GroceryItemDiscountDecorator {

	GroceryItem groceryItem;
	private final double DISCOUNT_PERCENTAGE = 10.00;
	double discount;
	public ApplesDiscountDecoratorImpl(GroceryItem groceryItem){
		this.groceryItem = groceryItem;
		discount = COST_OF_APPLE * DISCOUNT_PERCENTAGE / 100;
	}

	@Override
	public String getItemDescription() {
		return groceryItem.getItemDescription();
	}

	@Override
	double getCost() {
		return groceryItem.getCost() - discount ;
	}

	@Override
	public String getDiscountDescription() {
		return "\nApples "+ DISCOUNT_PERCENTAGE + "% off : -£" + discount + groceryItem.getDiscountDescription();
	}
}
