package Project;

import java.util.HashSet;
import java.util.Scanner;

public class PanagramChecker {
    public static boolean isPangram(String input) {
        // Convert the input string to lowercase to make the comparison case-insensitive
        input = input.toLowerCase();

        // Create a HashSet to store the unique characters in the input
        HashSet<Character> characters = new HashSet<>();

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is an alphabet letter (a to z)
            if (c >= 'a' && c <= 'z') {
                // Add it to the HashSet
                characters.add(c);
            }
        }

        // Check if the HashSet contains all 26 letters (a to z)
        return characters.size() == 26;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner (System.in);
        System.out.println("Enter sentence to check panagram or not");
        String sentence=sc.nextLine();
    	boolean isPangram = isPangram(sentence);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
