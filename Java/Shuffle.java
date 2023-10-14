package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shuffle {
    
	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		// Create an ArrayList 
        List<Integer> originallist = new ArrayList<>();

        System.out.println("Enter numbers want to add in arraylist(enter a non-numeric value to stop) :");
        //to add numbers in arraylist
        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            originallist.add(number);
        }
        // Shuffle the ArrayList
        Collections.shuffle(originallist);

        // Convert the shuffled ArrayList back to an array
        Integer[] shuffledArray = originallist.toArray(new Integer[0]);

        // Print the shuffled array
        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
