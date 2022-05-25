/** This is a basic tax calculator that takes in the users gross income and filing status to calculate how much taxes
 * they owe.
 * @author Zach Smith
 * @version Project #2
 */

import java.util.*;
import java.text.*;


public class Proj2 
{
  public static void main(String[] args) 
  {
	DecimalFormat df = new DecimalFormat("#,###,##0.00");
    Scanner s = new Scanner(System.in);
	
	System.out.print("Enter your gross income from 2019: $");
	double grossincome = Integer.parseInt(s.nextLine());
	int income = (int) Math.ceil(grossincome);
	double taxTotal = 0;
	System.out.println("Choose a filing status: ");
	System.out.println("\t (1) Single");
	System.out.println("\t (2) Head of Household");
	System.out.println("\t (3) Married filing jointly or qualifying widow");
	System.out.println("\t (4) Married filing seperately");
	System.out.print("Enter an option, 1-4: ");
	int filingStatus = Integer.parseInt(s.nextLine());
	int remainingincome = income;
	int toTax;
	
	if (filingStatus == 1 || filingStatus == 4) {
		remainingincome = (income - 12200);
	}
	if (filingStatus == 2) {
		remainingincome = (income - 18350);
	}
	if (filingStatus == 3) {
		remainingincome = (income - 24400);
	}
	
	// 37% Bracket
	if (remainingincome >= 510301 && (filingStatus == 1 || filingStatus  == 2)) {
		toTax = remainingincome - 510301;
		taxTotal = taxTotal + 0.37 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 612351 && filingStatus == 3) {
		toTax = remainingincome - 612351;
		taxTotal = taxTotal + 0.37 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 306176 && filingStatus == 4) {
		toTax = remainingincome - 306176;
		taxTotal = taxTotal + 0.37 * toTax;
		remainingincome = remainingincome - toTax;
	}
	
	// 35% Bracket
	if (remainingincome >= 204101 &&(filingStatus == 1 || filingStatus  == 2)) {
		toTax = remainingincome - 204101;
		taxTotal = taxTotal + 0.35 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 408201 && filingStatus == 3) {
		toTax = remainingincome - 408201;
		taxTotal = taxTotal + 0.35 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 204101 && filingStatus == 4) {
		toTax = remainingincome - 204101;
		taxTotal = taxTotal + 0.35 * toTax;
		remainingincome = remainingincome - toTax;
	}

	// 32% Bracket
	if (remainingincome >= 160726 && (filingStatus == 1 || filingStatus == 4)) {
		toTax = remainingincome - 160726;
		taxTotal = taxTotal + 0.32 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 160701 && filingStatus == 2) {
		toTax = remainingincome - 160701;
		taxTotal = taxTotal + 0.32 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 321451 && filingStatus == 3) {
		toTax = remainingincome - 321451;
		taxTotal = taxTotal + 0.32 * toTax;
		remainingincome = remainingincome - toTax;
	}

	// 24% Bracket
	if (remainingincome >= 84201 && (filingStatus == 1 || filingStatus == 4)) {
		toTax = remainingincome - 84201;
		taxTotal = taxTotal + 0.24 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 84201 && filingStatus == 2) {
		toTax = remainingincome - 84201;
		taxTotal = taxTotal + 0.24 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 168401 && filingStatus == 3) {
		toTax = remainingincome - 168401;
		taxTotal = taxTotal + 0.24 * toTax;
		remainingincome = remainingincome - toTax;
	}

	// 22% Bracket
	if (remainingincome >= 39476 && (filingStatus == 1 || filingStatus == 4)) {
		toTax = remainingincome - 39476;
		taxTotal = taxTotal + 0.22 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 52851 && filingStatus == 2) {
		toTax = remainingincome - 52851;
		taxTotal = taxTotal + 0.22 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 78951 && filingStatus == 3) {
		toTax = remainingincome - 78951;
		taxTotal = taxTotal + 0.22 * toTax;
		remainingincome = remainingincome - toTax;
	}

	// 12% Bracket
	if (remainingincome >= 9701 && (filingStatus == 1 || filingStatus == 4)) {
		toTax = remainingincome - 9701;
		taxTotal = taxTotal + 0.12 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 13851 && filingStatus == 2) {
		toTax = remainingincome - 13851;
		taxTotal = taxTotal + 0.12 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 19401 && filingStatus == 3) {
		toTax = remainingincome - 19401;
		taxTotal = taxTotal + 0.12 * toTax;
		remainingincome = remainingincome - toTax;
	}

	// 10% Bracket
	if (remainingincome >= 0 && (filingStatus == 1 || filingStatus == 4)) {
		toTax = remainingincome - 0;
		taxTotal = taxTotal + 0.10 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 0 && filingStatus ==2) {
		toTax = remainingincome - 0;
		taxTotal = taxTotal + 0.10 * toTax;
		remainingincome = remainingincome - toTax;
	}
	else if (remainingincome >= 0 && filingStatus == 3) {
		toTax = remainingincome - 0;
		taxTotal = taxTotal + 0.10 * toTax;
		remainingincome = remainingincome - toTax;
	}
	  int result = (int) Math.ceil(taxTotal);
	System.out.println("Taxes owed: $" + (df.format(result)));
  }
}