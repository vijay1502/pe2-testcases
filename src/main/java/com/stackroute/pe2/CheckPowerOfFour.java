package com.stackroute.pe2;

import java.util.Scanner;
import java.lang.Math;
public class CheckPowerOfFour {
    public String checkPower(int n){
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        double x=Math.log(n)/Math.log(4);
        if(x%0.25==0)
            return ("Yes it is power of four");
        else
            return ("It is not power of four");
    }
}
