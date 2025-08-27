package org.example;

public class CapitalizeStringInitials {
    public static void main(String[] args) {
         String str = "india loves coding"; // o/p: India Loves Coding
        String[] st = str.split(" ");  //["india","loves","coding"]
        StringBuilder sb = new StringBuilder();
       for(String s: st) {  // s=india
         if(!s.isEmpty())   {
             sb.append(Character.toUpperCase(s.charAt(0)))
                    .append(s.substring(1))
                    .append(" ");
         }
       }
        System.out.println(sb);
    }
}

