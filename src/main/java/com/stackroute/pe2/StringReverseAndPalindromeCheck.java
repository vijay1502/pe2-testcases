package com.stackroute.pe2;
public class StringReverseAndPalindromeCheck {
    public String reverseAndPalindromeMethod(String string){
        if(string!=null){
            if(string.length()>1){
                String temporary=string;
                String reverse="";
                for (int i=string.length()-1;i>=0;i--){
                    reverse=reverse+(string.charAt(i));
                }
                if(temporary.equals(reverse)){
                    return "Given String is a palindrome";
                }
                return "Given String is not a palindrome";
            }
            else return "The given input does not have multiple inputs to check for palindrome";
        }
        else return "null is not allowed";
    }
}
