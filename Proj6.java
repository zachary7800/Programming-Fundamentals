/*
This class calls our other classes and acesses the thesaurus.
It continually asks the user to lookup or the user can add words

Zach Smith
Project 6
Lab Friday 3:30-5:20
*/

import java.io.*;
import java.util.*;

public class Proj6 {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		Scanner inFile = new Scanner(new File("thesaurus.txt"));
		Thesaurus t = new Thesaurus();
		while(inFile.hasNextLine()) {
			String word = inFile.nextLine();
			StringTokenizer st = new StringTokenizer(word, "[],");
			String term = st.nextToken();
			while(st.hasMoreTokens()) {
				String synonym = st.nextToken().trim();
				t.addEntry(term,synonym);
			}
		}
		inFile.close();
		while(true) {
			System.out.print("Enter (l)ookup, (a)dd entry, or (q)uit: ");
			char choice = s.nextLine().charAt(0);
			if(choice == 'l') {
				System.out.print("Enter word: ");
				Entry e = t.getEntry(s.nextLine());
				if(e != null) {
					System.out.println("Result: " + e.getSynonyms());
				}
				else{
					System.out.println("Result: No synonyms found for the word");
				}
			}
			if(choice == 'a') {
				System.out.print("Enter a word: ");
				String word = s.nextLine();
				System.out.print("Enter a synonym: ");
				String syn = s.nextLine();
				if(!t.addEntry(word,syn)) {
					System.out.println("Error: cant add entry");
				}
			}
			if(choice == 'q') {
				break;
			}
		}
	}
}