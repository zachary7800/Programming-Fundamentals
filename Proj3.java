/* 
This project takes input from the user to calculate the actual area under the curve
and uses the Riemann Sums to approximate the area under the curve.

Author: Zach Smith
Version: Project 3

*/

import java.util.*;
import java.text.*;

public class Proj3 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.print("Enter a, for the equation ax^2 + bx + c: ");
		double a = Integer.parseInt(s.nextLine());
		System.out.print("Enter b, for the equation ax^2 + bx + c: ");
		double b = Integer.parseInt(s.nextLine());
		System.out.print("Enter c, for the equation ax^2 + bx + c: ");
		double c = Integer.parseInt(s.nextLine());
		
		System.out.println("");
		System.out.print("Enter x0: ");
		int x0 = Integer.parseInt(s.nextLine());
		System.out.print("Enter x1: ");
		int x1 = Integer.parseInt(s.nextLine());
		
		double actualarea =(((a*x1*x1*x1)/3)+((b*x1*x1)/2)+c*x1)-(((a*x0*x0*x0)/3)+((b*x0*x0)/2)+c*x0);
		
		System.out.println("For equation " + a + "x^2 + -" + b + "x + " + c);
		System.out.println("Area under the curve between " + x0 + " and " + x1 + ": " + (df.format(actualarea)));
		
		int i = 1;
		int j;
		double sum = 0;
		double width = (x1-x0) / i;
		for ( i = 1; i < 1001; i= i*10) {
			for ( j = x0; j <= x1; j=+((x1-x0) / i)) {
				width = (x1-x0) / i;
				break;
			}
		}
			
	
		System.out.println("Approximated area with rectangle width of " + ((x1-x0)/10.0) + ":");
		System.out.println("Approximated area with rectangle width of " + ((x1-x0)/100.0) + ":");
		System.out.println("Approximated area with rectangle width of " + ((x1-x0)/1000.0) + ":");
	

	
	}
}