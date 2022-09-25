package com.github.budison.codewars;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PangramCheckerTest {

    @Test
    public void testCheckWithExamples() {
        // Given
        String input1 = "The quick brown fox jumps over the lazy dog.";
        String input2 = "Woven silk pyjamas exchanged for blue quartz.";
        String input3 = "abcdefghijklmnopqrstuvwxyz";

        // Then
        assertTrue(PangramChecker.check(input1));
        assertTrue(PangramChecker.check(input2));
        assertTrue(PangramChecker.check(input3));
    }
}
