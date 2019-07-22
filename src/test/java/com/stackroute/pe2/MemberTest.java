package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MemberTest {

    Member member;
    MemberVariable memberVariable;
    @Before
    public void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        member = new Member();
        memberVariable=new MemberVariable();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        member = null;
        memberVariable=null;

    }


    @Test
    public void givenAStringArrayShouldReturnOutputString() {

        String arr="[Aniket, 22, 27000]";
        //the member information method should contain a String,integer and integer parameters
        //These parameters must be called into a child(Extended) class as an array
        String actualResult=member.memberInformation("Aniket",22,27000);
        assertEquals(arr,actualResult);
    }

    @Test
    public void givenAStringArrayShouldReturnOutputStringThroughAnotherClass() {

        String arr="[Vijay, 22, 25000]";
        //the member information method should contain a String,integer and integer parameters
        //These parameters must be called into a child(Extended) class as an array
        String actualResult=memberVariable.memberInfo("Vijay",22,25000);
        assertEquals(arr,actualResult);
    }



    @Test
    public void givenAStringArrayShouldReturnErrorIfStringHasNull() {
        //If any of the entered input String is null, it should return an error message

        String actualResult=member.memberInformation(null,20,20000);
        assertNotNull(actualResult);
        assertEquals("The String Value should not be a null",actualResult);
    }




}