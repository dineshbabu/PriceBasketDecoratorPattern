package pricebasket;

public class MilkDecoratorImpl extends GroceryItemDecorator {

	GroceryItem groceryItem;
	private final double COST_OF_MILK = 1.30;

	public MilkDecoratorImpl(GroceryItem groceryItem){
		this.groceryItem = groceryItem;
	}

	@Override
	public String getItemDescription() {
		return " Milk | " + groceryItem.getItemDescription();
	}

	@Override
	double getCost() {
		return COST_OF_MILK + groceryItem.getCost();
	}

}
