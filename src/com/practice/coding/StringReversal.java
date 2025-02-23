package com.practice.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReversal {
    public static void main(String[] args) {

        //soln 1: using reverse method
        List<String> list = Arrays.asList("apple","Mango","Banana","Grapes");
        List<String> revList = new ArrayList<>();
        for(String str:list) {
            StringBuilder sb =new StringBuilder(str);
            String s= sb.reverse().toString();
            revList.add(s);
        }
        System.out.println(revList);

        // soln 2:  without using reverse method
        List<String> revList2 = new ArrayList<>();
        for(String fruit:list) {
            String rev="";
           for(int i=fruit.length()-1;i>=0;i--){
               rev= rev+fruit.charAt(i);
           }
            revList2.add(rev);
        }
        System.out.println(revList2);
    }
}
