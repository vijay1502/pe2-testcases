package com.stackroute.pe2;

import java.util.Arrays;

public class Member {
    public String memberInformation(String name,int age,int salary){
        if(name!=null){
            String memberAge=Integer.toString(age);
            String memberSalary=Integer.toString(salary);
            String[] memberArray={name,memberAge,memberSalary};
            String memberVariables= Arrays.toString(memberArray);
            return memberVariables;
        }
        else {
            return "The String Value should not be a null";
        }
    }
}

class MemberVariable{
    public String memberInfo(String memberName,int memberAge,int memberSalary) {
        Member member = new Member();
        return member.memberInformation(memberName,memberAge,memberSalary);
    }
}