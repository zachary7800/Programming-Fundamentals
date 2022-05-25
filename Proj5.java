/*
This class reads in input from a file and stores them into a string array.
Then gives the user the option to search for a game by name, platform, or
year. Then it will print out all games that fit the given search criteria

Zach Smith
Project 5
Friday 3:30
*/

import java.util.*;
import java.io.*;

public class Proj5 {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		Scanner inFile = new Scanner(new File("games.txt"));
	    int num = Integer.parseInt(inFile.nextLine());
		
		Games[] allGames = new Games[num];
	    for (int i = 0; i < allGames.length; i++) {
	        inFile.nextLine();
	        String name = inFile.nextLine();
	        String platforms = inFile.nextLine();
			int year = Integer.parseInt(inFile.nextLine());
	        allGames[i] = new Games(name,platforms,year);
        }
	    inFile.close();
		
		char option;
		do {
			System.out.print("Enter (n)ame, (p)latform, (y)ear, or (q)uit: ");
			option = (s.nextLine().toLowerCase()).charAt(0);
			
			if(option == 'n') {
				System.out.print("Enter a game name or part of a name: ");
				String nSearch = s.nextLine();
				System.out.println("Matching Games: ");
				System.out.println();
				for(int i = 0; i < allGames.length; i++) {
					if(allGames[i].matchesName(nSearch)) {
						allGames[i].toString();
					}
				}
			}
			else if(option == 'p') {
				System.out.print("Enter a platform: ");
				String pSearch = s.nextLine();
				System.out.println("Matching Games: ");
				System.out.println();
				for(int i = 0; i < allGames.length; i++) {
					if(allGames[i].matchesPlatform(pSearch)) {
						allGames[i].toString();
					}
				}
			}
			else if(option == 'y') {
				System.out.print("Enter a year: ");
				int yr = Integer.parseInt(s.nextLine());
				System.out.println("Matching Games: ");
				System.out.println();
				for(int i = 0; i < allGames.length; i++) {
					if(allGames[i].matchesYear(yr)) {
						allGames[i].toString();
					}
				}
			}
			else if(option != 'q') {
				System.out.println("Error: Invalid Option");
				break;
			}
		}while(option != 'q');
	}
}