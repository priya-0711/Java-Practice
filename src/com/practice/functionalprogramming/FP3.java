package com.practice.functionalprogramming;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FP3 {
    public static void main(String[] args) {


          //reverse whole string as well as each Word of String
        String line = "program to reverse each word using functional programming";

        System.out.println(Stream.of(line).map(x-> new StringBuffer(x).reverse()).collect(Collectors.toUnmodifiableList()));

        //reverse the words of String and not the whole String
        System.out.println(Arrays.stream(line.split(" ")).map(s-> new StringBuffer(s).reverse()).collect(Collectors.toUnmodifiableList()));

        //   checkIfStringContainsOnlyDigits

        String digit = "1242232443452";
        System.out.println(digit.chars()
                .mapToObj(s-> (char) s).allMatch(s->Character.isDigit(s)));

        //countCharacterOccurence

        String s = "aacccssfefffsaasccs";
        System.out.println(Arrays.stream(s.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting())));

       //checkIfStringIsPalindrome

        String input = "madam";
        boolean isPalindrome= IntStream.range(0,input.length()).allMatch(i->input.charAt(i)==input.charAt(input.length()-i-1));
        System.out.println("palindrome: "+isPalindrome);

        //getFirstNonRepeatingCharacter
        String input1 = "aacbsaabccdde";
        System.out.println(
                Arrays.stream(input1.split(""))
                        .collect(Collectors.groupingBy(v->v,Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(d->d.getValue()==1)
                        .map(d->d.getKey())
                        .findFirst().get());



    }

}