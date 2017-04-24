# PriceBasket app

                  _____      _          ____            _        _
                 |  __ \    (_)        |  _ \          | |      | |
                 | |__) | __ _  ___ ___| |_) | __ _ ___| | _____| |_    __ _ _ __  _ __
                 |  ___/ '__| |/ __/ _ \  _ < / _` / __| |/ / _ \ __|  / _` | '_ \| '_ \
                 | |   | |  | | (_|  __/ |_) | (_| \__ \   <  __/ |_  | (_| | |_) | |_) |
                 |_|   |_|  |_|\___\___|____/ \__,_|___/_|\_\___|\__|  \__,_| .__/| .__/
                                                                            | |   | |
                                                                            |_|   |_|


This app lets you add shopping items to basket and to print out the total cost including discounts applied.

Allowed items are  
  Soup – 65p per tin  
  Bread – 80p per loaf  
  Milk – £1.30 per bottle  
  Apples – £1.00 per bag  

Current special offers:  
  Apples have a 10% discount off their normal price this week  
  Buy 2 tins of soup and get a loaf of bread for half price  

Expected result:  
If you run , PriceBasket Apples Milk Bread  
result should be  

Subtotal: £3.10  
Apples 10% off: -10p  
Total: £3.00  

## Technologies used  

Java 8  
Decorator design pattern is used to implement the solution  

## Development environment  
 
Windows 7  
IntelliJ IDE  


## Steps to build the application

Prerequisite : Java 8 installed

1) Use intelliJ Java IDE ( or any other ) and add the project to the IDE to view source code
2) To run the application, run PriceBasket.java

Eg:
If you run the following command,
PriceBasket Apples Apples Milk Milk Soup Soup Bread NonExistentItem

the result will be printed to the console as shown below:  

Item "NonExistentItem" is not available  

Items in the basket:  Bread |  Soup |  Soup |  Milk |  Milk |  Apples |  Apples |  

SubTotal: £6.7  
  
Bread 50.0% off : -£0.4  
Apples 10.0% off : -£0.1  
Apples 10.0% off : -£0.1  

Total price: £6.1
