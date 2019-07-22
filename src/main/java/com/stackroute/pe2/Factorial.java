package com.stackroute.pe2;

import java.util.Arrays;

public class Factorial {
    public String factorialMethod(int inputInteger){

        if(inputInteger>=0){

            String factor="";
            long[] factorial=new long[inputInteger];
            if(inputInteger<13){

                for(int i = 1; i <= inputInteger; ++i)
                {
                    factorial[0]=1;
                    // factorial = factorial * i;
                    factorial[i] =factorial[i-1]* i;
                    String[] fact={"factorial of "+i+" is "+factorial[i]};
                    factor= Arrays.toString(fact);
                }
                return factor;}
            else{
            return "Factorial of 13 is out 0f range";}
        }
        else {
            return "factorial cannot have negative values";
        }
    }

}
