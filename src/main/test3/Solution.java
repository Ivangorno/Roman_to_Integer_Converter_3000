package main.test3;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        RomanConverter(getRoman());
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

        roman = roman.replace("IV", "IIII");
        roman = roman.replace("IX", "VIIII");
        roman = roman.replace("XL", "XXXX");
        roman = roman.replace("XC", "XXXXXXXXX");
        roman = roman.replace("CD", "CCCC");
        roman = roman.replace("CM", "CCCCCCCCC");

        int number = 0;

        for (int i = 0; i < roman.length(); i++) {
            number = number + (map.get(roman.charAt(i)));
        }

        System.out.println("Your number converted from Roman is: " + number);
    }

    static String getRoman() {
        System.out.println("Enter a Roman numeral:  ");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        while (!inputString.matches("[IVXLCDM]+")){
            System.out.println("ERROR: invalid Roman numeral entered ");
            System.out.println("Please enter a ROMAN NUMERAL:  ");
            inputString=input.nextLine();
        }

        return inputString;
    }


}
