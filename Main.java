package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String reverseSentence = "";
        Scanner sc = new Scanner(System.in);

        // Saving sentence into a variable
        System.out.println("Write your sentence:");
        String sentence = sc.nextLine();
        // string to lowercase and removing accents, blanks and special characters
        sentence = sentence.toLowerCase().replace("á", "a").replace("é", "e")
                  .replace("í", "i").replace("ó", "o").replace("ú", "u")
                  .replace(" ", "").replaceAll("[^\\dA-Za-z]", "");
        // Reversing given sentence
        for (int i = sentence.length()-1; i>=0; i--){
            reverseSentence = reverseSentence + sentence.charAt(i);
        }
        if (sentence.equals(reverseSentence)){
            System.out.println("true, " + sentence + " is a palindrome");
        } else {
            System.out.println("false, " + sentence + " is not a palindrome");
        }

    }
}
