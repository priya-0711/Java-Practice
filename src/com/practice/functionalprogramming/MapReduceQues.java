package com.practice.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class MapReduceQues {
    public static void main(String[] args) {
       /* getAllUniqueCharacterForListOfStrings();
        countCharacterOccurence();
        longestStringInList();
        flattenAndSumNestedList();
        findAllWordsStartingWithSpecificCharacter();*/


        // 1. Get unique characters from the list of string
        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");  //["M","o","d"]
        System.out.println(words.stream()
                .flatMap(str->Arrays.stream(str.split("")))
                .collect(Collectors.toSet())
        );
         //using map and reduce
        System.out.println(words.stream()
                .map(word->Arrays.stream(word.split(""))
                .collect(toList()))
                .reduce((k1, k2)->{
                     k1.addAll(k2);
                     return k1;
                }).get().stream().distinct().collect(Collectors.toList()));

        //2.count char occurence
        String s = "aacccssfefffsaasccs";
        System.out.println(Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(y->y,Collectors.counting())));

        //3.  Find the longest string in the array
        List<String> wordss = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println(wordss.stream().reduce((k1,k2)->{
            return k1.length()>k2.length()?k1:k2;
        }).get());

        //3.  Find the first longest string in the array

        System.out.println(wordss.stream().reduce((k1,k2)->{
            if(k1.length()>k2.length())
            return k1;
            else if (k1.length()<k2.length())
                return k2;
            else return k1;
        }).get());

        //4. flattenAndSumNestedList
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        System.out.println(nestedLists.stream().flatMap(f->f.stream()).reduce((k1,k2)->{
            return k1+k2;
        }).get());

        //5.findAllWordsStartingWithSpecificCharacter 'a'
        List<String> wordsss = Arrays.asList("apple", "banana", "cherry", "apricot", "blueberry");
        System.out.println(wordsss.stream().filter(str->str.startsWith("a")).collect(Collectors.toList()));
        // let's aggregate words starting with 'a'

        System.out.println(wordsss.stream().filter(str->str.startsWith("a")).reduce((s1,s2)->s1+" "+s2).get());
    }
}
