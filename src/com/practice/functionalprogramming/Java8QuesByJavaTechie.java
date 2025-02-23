package com.practice.functionalprogramming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8QuesByJavaTechie {
    public static void main(String[] args) {
        //1. count of char occurence in a string
        String str="ilovejavatechie";
        System.out.println(Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s->s,Collectors.counting())));

        System.out.println(Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        //2.find duplicate elements from string
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s->s,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()>1).map(s->s.getKey())
                .forEach(x->System.out.print(x+","));

        System.out.println();

        //3.find first non repeating element from string
        System.out.println(Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s->s.getValue()==1).map(s->s.getKey())
                .findFirst()
                .get());

        //4. find  highest number from given array
        int [] num={5,9,11,2,8,21,1};
        System.out.println(Arrays.stream(num)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get());

        //5. find second highest no from array
        System.out.println(Arrays.stream(num)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get());

        //6.longest string from given array
        String[] st={"java","techie","microservices","spring"};
        System.out.println(Arrays.stream(st)
                .reduce((s1,s2)->{
            return s1.length()>s2.length()?s1:s2;
        } ).get());

        //7. find elements from array starting with 1
        int [] numb={5,9,11,2,8,21,1};

        Arrays.stream(numb).boxed().map(s->s+"").filter(s->s.startsWith("1")).forEach(x->System.out.print(x+","));

        //8. sort a map basd on keys.
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("cherry", 5);
        map.put("date", 4);

        System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList())) ;
    }
}
