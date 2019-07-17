package com.stackroute.pe2;

import java.util.Scanner;

public class StudentDetails {
    Scanner scanner=new Scanner(System.in);
    int numberofElements=scanner.nextInt();


    public int studentCheckDetail(int[] number){
        int average=0;

    for(int i=0;i<numberofElements;i++){
        number[i]= scanner.nextInt();
        average=average+number[i]/numberofElements;
    }

    return average;}

    public int studentCheckDetailMax(int[] number){


        for(int i=0;i<numberofElements;i++){
            number[i]= scanner.nextInt();

        }
        int max=number[0];
        for(int i=1;i<numberofElements;i++) {
            if (number[i]>max){
                max=number[i];}
        }

        return max;}

    public int studentCheckDetailMin(int[] number){


        for(int i=0;i<numberofElements;i++){
            number[i]= scanner.nextInt();

        }
        int min=number[0];
        for(int i=1;i<numberofElements;i++) {
            if (number[i]<min){
                min=number[i];}
        }

        return min;}
}
