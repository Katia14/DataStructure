package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> randomWords = new ArrayList<>();
        randomWords.add("Computer");
        randomWords.add("Plate");
        randomWords.add("Chair");
        randomWords.add("Girl");
        randomWords.add("Boy");
        randomWords.add("Cat");
        randomWords.add("Dog");
        randomWords.add("Determination");

        int startsWithC = 0;
        int endsWithE = 0;
        int containsE = 0;
        int length5 = 0;

        for (String value : randomWords) {
            if (value.startsWith("C")) {
                startsWithC++;
            }
        }
        System.out.println("\nThere are " + startsWithC + " words starting with 'C' ");

        for (String value : randomWords) {
            if (value.endsWith("e")) {
                endsWithE++;
            }
        }
        System.out.println("\nThere is " + endsWithE + " word ending with 'e' ");

        for (String value : randomWords) {
            if (value.contains("e")) {
                containsE++;
            }
        }
        System.out.println("\nThere are " + containsE + " words contains 'e' ");

        for (String value : randomWords) {
            if (value.length() == 5) {
                length5++;
            }
        }
        System.out.println("\nThere are " + length5 + " words with length '5' ");

        for (String value : randomWords) {
            if (value.contains("te")) ;
        }
        System.out.println("\nThere are words containing 'te' ");

        System.out.println("\nBefore Sorting:");
        for (String counter : randomWords) {
            System.out.println(counter);
        }

        // Sort statement
        Collections.sort(randomWords);

           System.out.println("\nAfter Sorting:");
        for (String counter : randomWords) {
            System.out.println(counter);
        }
    }
}





