package org.example;

import java.util.Arrays;

public class AnagramsExample {
    public static void main(String[] args) {
        //anagrams("rail safety","fairy tales")-->TRue
        //anagrams("Hi there!,","Bye There!")-->False
        //only consider characters not spaces or punctuation .Consider uppercase same as lower case


        String str1 = "Hi there!"; //aaefilrsty
        String str2 = "HiT heer"; //aaefilrsty

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();


        char[] trimmedStr1 = str1.trim().toLowerCase().toCharArray(); //[h,i,t,h,e,r,e,!]
        char[] trimmedStr2 = str2.trim().toLowerCase().toCharArray();

        for (char c1 : trimmedStr1) {
            if (Character.isLetterOrDigit(c1)) {
                sb1.append(c1);
            }
        }
        for (char c2 : trimmedStr2) {
            if (Character.isLetterOrDigit(c2)) {
                sb2.append(c2);
            }
        }
        char[] c21 = sb1.toString().toCharArray();
        Arrays.sort(c21);

        char[] c22 = sb1.toString().toCharArray();
        Arrays.sort(c22);

        String str11 = new String(c21);
        String str12 = new String(c22);
        if (str11.length() == str12.length() && str11.equalsIgnoreCase(str12)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
