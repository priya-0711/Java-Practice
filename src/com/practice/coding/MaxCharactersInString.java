package com.practice.coding;

import java.util.HashMap;
import java.util.Map;

public class MaxCharactersInString {
    public static void main(String[] args) {
    //    maxChar("abcccccccd") === "c"
    //    maxChar("apple 1231111") === "1"

        String str= "abcccccccd";

        Map<Character,Integer> map= new HashMap<>();
        for (int i=0;i<str.length();i++) {
            if(!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),1);
            } else{
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }
        }
        System.out.println(map);
        int max=0; char key = 0;
        for(Map.Entry<Character,Integer> m :map.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                key = m.getKey();
            }
        }
        System.out.println(key +"="+max);
        //using java 8 print max character with max occurence
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get());
    }
}
