package com.practice.functionalprogramming;

import java.util.*;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args) {
        //Java Streams
        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");

        Set set= new HashSet<>();
        for(String word:words){
            String[] str=word.split("");
            for(String ch:str){
                set.add(ch);
            }
        }
        System.out.println(set);

//        [[],[],[]]->[]  (flatmap = map+reduce)

        //java 8

        System.out.println(words.stream().map(word->word.split("")).map(Arrays::stream).map(c->c.findAny().get()).collect(Collectors.toUnmodifiableList()));
        System.out.println(words.stream().map(word->word.split("")).flatMap(c-> Arrays.stream(c)).distinct().collect(Collectors.toUnmodifiableList()));
        System.out.println(words.stream().map(word->word.chars()).flatMap(s->s.mapToObj(x->String.valueOf((char)x))).distinct().collect(Collectors.toList()));

        //using map and reduce instead of flatmap  [m,o,d,e,r,n]->m,o,d,e,r,n
        System.out.println(words
              .stream()
                .map(s->Arrays.asList(s.split("")))
                .reduce(new ArrayList<>(),(l1, l2) ->
                {
                    l1.addAll(l2);
                     return l1;
                })
                .stream()
                .distinct()
                .collect(Collectors.toList())
        );

        //  Find the Sum of Squares of a List of Numbers
        List<Integer> list= Arrays.asList(1,2,3,4,5);  //25+16+9+4+1
        System.out.println(list.stream().map(x->x*x).reduce(0,(k1,k2)-> {
            return k1+k2;
        })
        );

        // Count the number of characters in the whole list.

        List<String> strings = Arrays.asList("Java", "Stream", "Reduce");  //
        System.out.println(strings.stream().map(k->k.length()).reduce(( k1, k2)-> {
            return (k1+k2);
        }).get()
        );


    // Find the first longest string in the array.
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println(fruits.stream().map(s->s.length()).reduce((l1,l2)->{
            return (l1>l2)?l1:l2;
        }).get());

        System.out.println(fruits.stream().reduce((k1,k2)->{
            if(k1.length()>k2.length()){
                return k1;
            } else if(k1.length()==k2.length()){
                return k1;
            }
            return k2;
        }).get());

    //    Given a list of lists, flatten it and compute the sum of all elements.

        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
     //   [[1,2,3],[4,5],[6,7,8]]
        System.out.println(nestedLists.stream().flatMap(s->s.stream()).reduce((k1,k2)-> { return k1+k2;}).get());
        System.out.println(nestedLists.stream().flatMap(s->s.stream()).reduce(0, Integer::sum));
        System.out.println(
                nestedLists.stream()
                .map(s->s.stream().reduce(0,Integer::sum))
                .reduce(Integer::sum).get()
        );
    }
}