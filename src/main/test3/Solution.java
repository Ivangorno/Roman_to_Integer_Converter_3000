package main.test3;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        String romanNumeral = getRoman();
        RomanConverter(romanNumeral);
    }

    public static void RomanConverter(String roman) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        roman.replace("IV", "IIII");
        roman.replace("IX", "IIIIIIIII");
        roman.replace("XL", "XXXX");
        roman.replace("XC", "XXXXXXXXX");
        roman.replace("CD", "CCCC");
        roman.replace("CM", "CCCCCCCCC");

        int number = 0;

        for (int i = 0; i < roman.length(); i++) {
            number = number + map.get(roman.charAt(i));
        }

        System.out.println("Your number converted from Roman is: " + number);
    }

    static String getRoman() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Roman numeral:  ");

        return input.nextLine();
    }


}
