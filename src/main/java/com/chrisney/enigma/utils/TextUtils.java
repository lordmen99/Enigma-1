package com.chrisney.enigma.utils;

import java.util.Random;

/**
 * String helper functions
 */
public class TextUtils {

    /**
     * Check if a string ends with a specific character
     * @param value String to test
     * @param character Specific character
     * @return True if the string ends with the specific character
     */
    public static boolean endsWith(String value, char character) {
        if (value == null) return false;
        String tempValue = value.trim();
        return tempValue.charAt(tempValue.length() - 1) == character;
    }

    /**
     * Check if the string is null or empty
     * @param value String to test
     * @return True if string is null or empty
     */
    public static boolean isEmpty(String value) {
        return value == null || value.isEmpty();
    }

    /**
     * Generate a random string from character list
     * @param size Size of the output string
     * @param chars Character list
     * @return Random string
     */
    public static String getRandomString(int size, String chars) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; ++i) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    /**
     * Check if character is equals to 'space' or 'carrier return', or 'tabulation'
     * @param c Character to test
     * @return True if character is equals to 'space' or 'carrier return', or 'tabulation'
     */
    public static boolean isEmptyChar(Character c) {
        return  c.equals(' ') || c.equals('\r') || c.equals('\n') || c.equals('\t');
    }

    /**
     * Check if Character is containing by the characters list
     * @param list Characters list
     * @param character Searched character
     * @return True if the character is contained by the list
     */
    public static boolean inCharactersList(char[] list, char character) {
        for (char c : list) {
            if (c == character) return true;
        }
        return false;
    }

    /**
     * Check if the string is a space value
     * @param s String to check
     * @return True if string contains only space characters
     */
    public static boolean isSpace(String s) {
        return s != null && s.trim().length() == 0;
    }

    /**
     * Test if the character is a Return Character
     * @param c Character to test
     * @return True if the character is a Return Character
     */
    public static boolean isReturnChar(Character c) {
        return c.equals('\r') || c.equals('\n') || c.equals(System.lineSeparator().charAt(0));
    }

    /**
     * Check if the String is equal to a Character
     * @param s String to test
     * @param c Character to test
     * @return True of string is equals to character
     */
    public static boolean isEqualsToChar(String s, char c) {
        return s != null && s.charAt(0) == c;
    }
}
