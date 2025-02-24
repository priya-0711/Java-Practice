package org.example;

public class CapitalizeStringInitials {
    public static void main(String[] args) {
        String str="i love coding";
        String[] s= str.split(" ");  //[i,love,coding]
        String st=""; String string="";

        for(int i=0;i<s.length;i++) {
            st = s[i].toString(); //"love"
            for (int j = 0; j < st.length(); j++) {
                char c = st.charAt(0);
                if (c == st.charAt(j)) {
                    string =  string + " " + String.valueOf(c).toUpperCase();
                } else {
                    string = string +st.charAt(j);
                }
            }
        }
        System.out.println(string);
    }
}
