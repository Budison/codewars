package com.github.budison.codewars;

/**
 * @author Kevin Nowak
 */
class PangramChecker {

    /**
     * Check if a string is a pangram
     *
     * @param sentence The string to be checked
     * @return True if given string is a pangram, false otherwise
     */
    static boolean check(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.toLowerCase().contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
