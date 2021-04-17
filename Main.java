package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write a sentence:");
        String phrase = sc.nextLine();

        // Cleaning String
         phrase = phrase.toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(" ", "")
                .replace("[a-zA-Z0-9]", "");

         int x = 0,
             y = phrase.length() - 1;

         while(x < y){
             if (phrase.charAt(x) != phrase.charAt(y)){
                 System.out.println("false");
                 System.exit(0);
             }
             x++;
             y--;
         }
        System.out.println("true");





    }
}
