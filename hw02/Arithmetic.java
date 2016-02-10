//Reed Pinterich
//6 February 2016
//Brian Chen CSE2 HW 02
// This program is designed to calculate the total cost of several items, in addition to their sales tax
public class Arithmetic {
    public static void main(String[] args) {
        // doubles to store the given variables
        double numPants = 3;
        double pantsPrice = 34.98;
        double numShirts = 2;
        double shirtPrice = 24.99;
        double numBelts = 1;
        double beltPrice = 33.99;
        double salesTax = 0.06;
        //Calculations
        double pantsTotal = numPants * pantsPrice;
        double shirtTotal = numShirts * shirtPrice;
        double beltTotal = numBelts * beltPrice;
        double pantsTax = ((int) (100 * pantsTotal * salesTax))/100.0; // convert the tax doubles to ints to remove extra spaces
        double shirtTax = ((int) (100 * shirtTotal * salesTax))/100.0;
        double beltTax = ((int) (100 * beltTotal * salesTax))/100.0;
        double subtotal = (pantsTotal + shirtTotal + beltTotal);
        double totalTax = pantsTax + shirtTax + beltTax;
        double totalCost = subtotal + totalTax;
        // print everything neatly
        System.out.println("The total pants cost is $" + pantsTotal + " and the tax is $" + pantsTax);
        System.out.println("The total shirt cost is $" + shirtTotal + " and the tax is $" + shirtTax);
        System.out.println("The total belt cost is $" + beltTotal + " and the tax is $" + beltTax);
        System.out.println("The subtotal is $" + subtotal + ", the tax is $" + totalTax + " and the total cost is $" + totalCost);
    }
}