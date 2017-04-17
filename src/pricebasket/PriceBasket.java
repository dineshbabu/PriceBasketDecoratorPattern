package pricebasket;

import java.text.DecimalFormat;
import java.util.Arrays;

public class PriceBasket {

	static final int[] soupCount = {0};

	public static void main(String[] items) {

		if(hasUsageError(items) ){
			System.out.println("\nWrong usage. Example usage : PriceBasket Milk Milk Soup Soup Bread Apples");
			return;
		}

		DecimalFormat rounded = new DecimalFormat("#.##");
		final GroceryItem[] groceryItem = {new GroceryItemImpl()};

		CalculateCost(items, groceryItem, soupCount);

		System.out.println("\nItems in the basket: " + groceryItem[0].getItemDescription());
		System.out.println("\nSubTotal: £" +Double.valueOf(rounded.format(groceryItem[0].getCost())));

		setSoupCount(groceryItem[0]);

		applyDiscounts(items, groceryItem);

		System.out.println(groceryItem[0].getDiscountDescription().equals("") ? "\nNo offers available" : groceryItem[0].getDiscountDescription());
		System.out.println("\nTotal price: £" +Double.valueOf(rounded.format(groceryItem[0].getCost())));
	}

	private static boolean hasUsageError(String[] items) {
		return items.length == 0;
	}

	private static void CalculateCost(String[] items, GroceryItem[] groceryItem, int[] soupCount) {
		Arrays.stream(items)
			.forEach(s -> {
				if(s.equals("Bread")){
					groceryItem[0] = new BreadDecoratorImpl(groceryItem[0]);
				}else if(s.equals("Milk")){
					groceryItem[0] = new MilkDecoratorImpl(groceryItem[0]);
				}else if(s.equals("Apples")){
					groceryItem[0] = new ApplesDecoratorImpl(groceryItem[0]);
				}else if(s.equals("Soup")){
					soupCount[0]++;
					groceryItem[0] = new SoupDecoratorImpl(groceryItem[0]);
				}else{
					System.out.println("\nItem \"" + s + "\" is not available");
				}
			});
	}

	private static void setSoupCount(GroceryItem groceryItem){
		groceryItem.setSoupCount(soupCount[0]);
	}


	private static void applyDiscounts(String[] items, GroceryItem[] groceryItem) {
		Arrays.stream(items)
				.forEach(s -> {
					if(s.equals("Apples")){
						groceryItem[0] = new ApplesDiscountDecoratorImpl(groceryItem[0]);
					}else if(s.equals("Bread")){
						groceryItem[0] = new BreadDiscountDecoratorImpl(groceryItem[0]);
					}
				});
	}

}
