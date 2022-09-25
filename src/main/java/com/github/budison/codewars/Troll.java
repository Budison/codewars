package com.github.budison.codewars;

import java.util.regex.Pattern;

/**
 * @author Kevin Nowak
 */
class Troll {

    /**
     * Pre compiled pattern to match all vowels in a given string
     */
    private static final Pattern DISEMVOWEL_PATTERN = Pattern.compile("(?i)[aeiou]");

    /**
     * Remove all vowels from the given input string
     *
     * @param str The string to remove vowels from
     * @return A copy of the original string with all vowels removed
     */
    static String disemvowel(String str) {
        return DISEMVOWEL_PATTERN.matcher(str).replaceAll("");
    }
}
