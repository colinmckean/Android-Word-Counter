package com.codeclan.example.wordcounterapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/02/2017.
 */

public class WordCounterTest {
    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter();
    }

    @Test
    public void testWordCount() {
        assertEquals(5, wordCounter.countWords("Hello this has five words"));
    }

    @Test
    public void testOccuranceOfWords() {
        assertEquals("\"it\" : 6, \"was\" : 6, \"the\" : 6, \"best\" : 1, \"of\" : 6, \"times\" : 2, \"worst\" : 1, \"age\" : 2, \"wisdom\" : 1, \"foolishness\" : 1, \"epoch\" : 2, \"belief\" : 1, \"incredulity\" : 1", wordCounter.countOccurrences("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, …"));
    }
}