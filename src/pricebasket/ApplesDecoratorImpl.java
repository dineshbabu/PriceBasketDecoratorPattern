package pricebasket;

public class ApplesDecoratorImpl extends GroceryItemDecorator {


	GroceryItem groceryItem;
	public ApplesDecoratorImpl(GroceryItem groceryItem){
		this.groceryItem = groceryItem;
	}

	@Override
	public String getItemDescription() {
		return " Apples | " + groceryItem.getItemDescription();
	}

	@Override
	double getCost() {
		return COST_OF_APPLE + groceryItem.getCost();
	}

}
