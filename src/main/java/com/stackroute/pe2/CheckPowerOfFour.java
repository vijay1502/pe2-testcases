package com.stackroute.pe2;
public class CheckPowerOfFour {
    public String checkPower(int number){
       /* Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();*/
        double result=Math.log(number)/Math.log(4);
        if(result%0.25==0)
            return ("Yes it is power of four");
        else
            return ("It is not power of four");
    }
}
