/* 	This program is supposed to check the bits of an array and
	corecct the image if there was any problems.
	
	Zach Smith
	Project 4
*/

import java.util.*;
import java.io.*;

public class Proj4 {
	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		
		//Asking the User for the Input File		
		System.out.print("Enter input file name: ");
		String fn = s.nextLine();		
		Scanner inFile = new Scanner(new File(fn));		
		
		//Reading into a 2D Array
		int rows = Integer.parseInt(inFile.nextLine());
		int cols = Integer.parseInt(inFile.nextLine());
		inFile.nextLine();
		inFile.close();
		
		int[][] grid = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = grid[i][j];
			}
		}
	
		int[] RowTotal = new int[rows];
		int sums = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				 sums += grid[i][j];		
			}
			RowTotal[i] = sums;
			sums = 0;
		}
			
		//Checking to see any rows with an odd number of 1s
		int countRow = 0;
		
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if (!isEven(RowTotal[i])) {
				countRow += 1;
				}
				if (countRow > 1) {
				break;
				}
			}
		}
		
		boolean OddRow;
		if (countRow == 0) {
			OddRow = false;
		}			
				
		int countCol = 0;
		for(int j = 0; j < cols; j++) {
			if (!isEven(RowTotal[j])) {
			countCol += 1;
			}
			if (countCol > 1) {
				break;
			}
		}
	
		boolean OddCol;
		if (countCol == 0) {
			OddCol = false;
		}
	System.out.println("Substitute Character for 1(white): ");
	System.out.println("Substitute Character for 0(black): ");
	}
	public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
		}
	}	