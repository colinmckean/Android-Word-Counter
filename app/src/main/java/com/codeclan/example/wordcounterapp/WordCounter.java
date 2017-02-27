package com.codeclan.example.wordcounterapp;

import java.util.LinkedHashMap;

/**
 * Created by user on 27/02/2017.
 */
public class WordCounter {
    public int countWords(String s) {
        int counter = 0;
        String[] words = getArray(s);
        for (String word : words) {
            counter++;
        }
        return counter;
    }

    public String countOccurrences(String s) {
        String returnString = "";
        LinkedHashMap<String, Integer> myMap = new LinkedHashMap<>();
        String[] words = getArray(s);

        for (String word : words) {
            if (!myMap.containsKey(word)) {
                myMap.put(word, 1);
            } else {
                myMap.put(word, myMap.get(word) + 1);
            }
        }
        for (String word : myMap.keySet()) {
            returnString += String.format("\"%s\" : %s, ", word, myMap.get(word));
        }
        return returnString.substring(0, returnString.length() - 2);
    }

    public String[] getArray(String s) {
        return s.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    }
}