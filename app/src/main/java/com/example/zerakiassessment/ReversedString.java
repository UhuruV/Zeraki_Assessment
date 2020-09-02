package com.example.zerakiassessment;


public class ReversedString {
    public static void main(String[] args) {
        String str = "Java is an object oriented programming language";

        for (int i = 0; i < str.length(); i++) {
            String reversed = reversedString(str);
            System.out.println(reversed);
        }
    }

    private static String reversedString(String str) {
        if (str.isEmpty())
            return str;

        return reversedString(str.substring(0,4)) + str.charAt(0);
    }
}