package pricebasket;

public class BreadDecoratorImpl extends GroceryItemDecorator {

	GroceryItem groceryItem;

	public BreadDecoratorImpl(GroceryItem groceryItem){
		this.groceryItem = groceryItem;
	}

	@Override
	public String getItemDescription() {
		return " Bread | " + groceryItem.getItemDescription();
	}

	@Override
	double getCost() {
		return COST_OF_BREAD + groceryItem.getCost();
	}

}
