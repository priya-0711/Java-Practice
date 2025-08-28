package com.practice.coding;

public class PalindromeExample {
    public static void main(String[] args) {
       // palindrome("abba") === true
        // palindrome("abcdefg") === false
        String str ="abcdefg"; String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev))
            System.out.println("true");
        else
            System.out.println("false");
 }   
    //   #approach 2:
public static boolean palindrome(String str) {
        for(int i=0; i< str.length()/2;i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
                return true;
    }

    
}
