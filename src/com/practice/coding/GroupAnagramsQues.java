package com.practice.coding;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagramsQues {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat","act","tac","dog","ogd");  // output: [[cat,act,tac],[dog,ogd]]
        char[] ch;
        HashMap<String,List<String>> hmap = new HashMap<>();
        for(String str:list) {
            // converting into char array
             ch = str.toCharArray();
             // sort the char array
             Arrays.sort(ch);// [a,c,t]
            String s=new String(ch);
            if(!hmap.containsKey(s)) {
               hmap.put(s,new ArrayList<>());
               hmap.get(s).add(str);
            } else {
                hmap.get(s).add(str);
            }
        }
        System.out.println(hmap
                .entrySet()
                .stream()
                .map(x->x.getValue())
                .collect(Collectors.toUnmodifiableList()));
    }
}
