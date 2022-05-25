// This progam helps estimate the cost and time of a road trip
// @author Zach Smith
// @version Project 1



import java.util.*;
import java.text.*;

public class Proj1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int miles;
		int maxHours;
		final double gascost = 2.39;
		final double hotelcost = 99.95;
		final int gasmileage = 30;
		final int avgspeed = 60;
			

		System.out.println("This program determines driving time and cost for a road trip.\nIt makes the following assumptions: ");
		System.out.println("\tGas cost: $2.39/gallon");
		System.out.println("\tHotel cost: $99.95/night");
		System.out.println("\tHighway gas mileage: 30 mpg");
		System.out.println("\t60 mph trip average");
		
		System.out.println("\nEnter miles to destination: ");
		miles = Integer.parseInt(s.nextLine());
		System.out.println("Enter daily max driving hours(1-20): ");
		maxHours = Integer.parseInt(s.nextLine());
		int totalMinutes = miles;
		int maxMinutes = maxHours * 60;
		int days = totalMinutes / maxMinutes;
		int leftover = totalMinutes % maxMinutes;
		int leftoverHours = (leftover / 60);
		int leftoverMinutes = leftover % 60;
		double totalgascost = miles/gasmileage*gascost;
		double totalhotelcost = hotelcost * days;
		double overallcost = totalgascost + totalhotelcost;
		
		System.out.println("\nDrive will take " + days + " full driving days (" + maxHours + " hours per day)\nplus " + leftoverHours + (" additional hours and ") + leftoverMinutes + (" minutes."));
		System.out.println("\nTotal hotel cost (for " + days + " days): $" + days * hotelcost);
		System.out.println("Total gas cost: $" + (df.format(totalgascost)));
		System.out.println("Overall cost: $" + (df.format(overallcost)));
	}
}