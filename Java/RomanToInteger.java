package Project;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a HashMap to map Roman numeral characters to their integer values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));
            int nextValue = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

            if (currentValue < nextValue) {
                // If a smaller value is before a larger value, subtract the smaller from the result
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman Number in capital letters: ");
        String romanNumeral= sc.nextLine();
         // Replace with the Roman numeral you want to convert
        int intValue = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + intValue);
    }
}
