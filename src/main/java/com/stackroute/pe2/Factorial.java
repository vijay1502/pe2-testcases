package com.stackroute.pe2;

public class Factorial {
    public String factorialMethod(int inputInteger){
        int factorial=1;

        String[] output=new String[inputInteger];
        if(inputInteger>0) {
            if(inputInteger<13) {
                for (int i = 1; i < inputInteger; i++) {

                    factorial = factorial*(i+1);

                }
                return "factorial of "+inputInteger+" is "+factorial;}
        else {
            return "The output range is greater than 32 bit";
            }}

            return "factorial cannot have negative values";

    }

}
