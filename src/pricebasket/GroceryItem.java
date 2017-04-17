package pricebasket;

public abstract class GroceryItem {
	protected final double COST_OF_APPLE = 1.00;
	protected final double COST_OF_BREAD = 0.80;

	String itemDescription = "";
	String discountDescription = "";
	static int soupCount = 0;

	String getItemDescription(){
		return itemDescription;
	}

	public String getDiscountDescription() {
		return discountDescription;
	}

	public int getSoupCount() {
		return soupCount;
	}

	public void setSoupCount(int soupCount) {
		this.soupCount = soupCount;
	}

	abstract double getCost();
}
