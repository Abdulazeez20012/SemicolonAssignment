###
speudo code for pizza whahala
prompt the user to slot in  the number of people 
collect the number and store the number as "numberOfPeople"
propmpt the user to input the type of pizza based on the pizza type listed : sapa size,Small Money,big boys ,odogwu.
collect the pizza type and store as "pizzaType"
We calculate how many boxes are needed by dividing the number of people by the slices per box. 
If there’s a remainder (not perfectly divisible), we add one more box.
calculate how many slices will be left over after serving the guests.
calculate the total cost by multiplying the number of boxes by the price per box.
display the number of boxes, leftover slices, and the total price.
###



import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
      		  System.out.print("Enter the number of people: ");
      		  int numberOfPeople = scanner.nextInt(); 

      		  System.out.print("Enter the pizza type (Sapa size, Small Money, Big boys, Odogwu): "); 
      		  String pizzaType = scanner.nextLine(); 

      			  int slicesPerBox = 0;
      			  int pricePerBox = 0;

       				 if (pizzaType.equalsIgnoreCase("Sapa size")) {
           				 slicesPerBox = 4;
           				 pricePerBox = 2500;
       				 } else if (pizzaType.equalsIgnoreCase("Small Money")) {
          				  slicesPerBox = 6;
           				 pricePerBox = 2900;
       				 } else if (pizzaType.equalsIgnoreCase("Big boys")) {
         				  slicesPerBox = 8;
          				  pricePerBox = 4000;
      				 } else if (pizzaType.equalsIgnoreCase("Odogwu")) {
            				slicesPerBox = 12;
           			 	pricePerBox = 5200;
       				 } else {
            				System.out.println("not a pizza type Please enter a valid pizza type.");
           				 
      				  }

      						  int numberOfBoxes = numberOfPeople / slicesPerBox;
      						  if (numberOfPeople % slicesPerBox != 0) {
        						    numberOfBoxes++;  
      							  }

       								 int totalSlices = numberOfBoxes * slicesPerBox;
      								  int leftoverSlices = totalSlices - numberOfPeople;

       									 int totalPrice = numberOfBoxes * pricePerBox;

      	  System.out.println("Number of boxes of pizza to buy = " + numberOfBoxes + " boxes");
        System.out.println("Number left over slices after serving = " + leftoverSlices + " slices");
        System.out.println("Price = " + totalPrice);


    }
}
