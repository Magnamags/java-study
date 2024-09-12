package Strings;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
    String sentence = "Java programming is fun and Java is powerful";
    String wordToFind = "Java";
    // Convert both sentence and wordToFind to lowercase for case-insensitive comparison
    sentence = sentence.toLowerCase();
    wordToFind = wordToFind.toLowerCase();
    // Split the sentence into words by spaces
        String[] words = sentence.split(" ");
    // Initialize a counter to store the frequency
    int frequency = 0;
    // Loop through the words array to count occurrences of wordToFind
        for (String word : words) {
        // If word matches wordToFind, increment frequency
        if (word.equals(wordToFind)) {
            frequency++;
        }
    }
        System.out.println("Frequency of '" + wordToFind + "' in the sentence:");
        System.out.println(sentence);
        System.out.println("is " + frequency);
}
}
