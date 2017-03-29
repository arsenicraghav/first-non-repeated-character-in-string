package com.arsenicraghav;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        char c = firstNonRepeating(inputStr);
        System.out.println("First non repeating character in the string is: "+ c);
    }

    public static Character firstNonRepeating(String inputStr){

        HashMap<Character,Integer> map = new HashMap<Character, Integer> ();

        for (int i=0; i<inputStr.length();i++){

            char currChar = inputStr.charAt(i);

            if(map.containsKey(currChar)){
                map.put(currChar, map.get(currChar)+ 1);
            }else{
                map.put(currChar,1);
            }
        }

        for(int i=0; i<inputStr.length(); i ++) {

            char currChar = inputStr.charAt(i) ;

            if (map.get(currChar) == 1) {
                return currChar ;
            }
        }
        return null;
    }
}
