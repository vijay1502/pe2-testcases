package com.stackroute.pe2;
public class StudentDetails {
public String checkStudentDetailAvg(int numberOfStudents,int[] marks){
    int sumOfMarks=0;
    if(marks.length!=numberOfStudents){
        return "No.of Students and marks length are not matching";
    }
    else {
        for (int i=0;i<numberOfStudents;i++){
            sumOfMarks=sumOfMarks+marks[i];
        }
        int average=sumOfMarks/numberOfStudents;
        return ("Average of student marks is "+average);
    }
}
    public String checkStudentDetailMax(int numberOfStudents,int[] marks){
    int maximumMarks=0;
        if(marks.length!=numberOfStudents){
            return "No.of Students and marks length are not matching";
        }
        else {
            for (int i=0;i<numberOfStudents;i++){
                for (int j=1;j<numberOfStudents;j++){
                if(marks[i]>marks[j]){
                    maximumMarks=marks[i];
                    marks[i]=marks[j];
                    marks[j]=maximumMarks;

                }
            }}
            return ("Maximum mark is "+maximumMarks);}
    }
    public String checkStudentDetailMin(int numberOfStudents,int[] marks){
        int minimumMarks=0;
        if(marks.length!=numberOfStudents){
            return "No.of Students and marks length are not matching";
        }
        else {
            for (int i=0;i<numberOfStudents;i++){
                for (int j=1;j<numberOfStudents;j++){
                    if(marks[i]<marks[j]){
                        minimumMarks=marks[i];
                        marks[i]=marks[j];
                        marks[j]=minimumMarks;

                    }
                }}
            return ("Minimum mark is "+minimumMarks);}
    }
}
