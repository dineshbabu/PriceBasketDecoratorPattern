package pricebasket;

public class SoupDecoratorImpl extends GroceryItemDecorator {

	GroceryItem groceryItem;
	private final double COST_OF_SOUP = 0.65;

	public SoupDecoratorImpl(GroceryItem groceryItem){
		this.groceryItem = groceryItem;
	}

	@Override
	public String getItemDescription() {
		return " Soup | " + groceryItem.getItemDescription();
	}

	@Override
	double getCost() {
		return COST_OF_SOUP + groceryItem.getCost();
	}

}
