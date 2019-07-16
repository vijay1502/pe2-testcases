package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MemberDetailsTest {

    private MemberVariables member;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        member = new MemberVariables();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        member = null;

    }


    @Test
    public void givenAStringArrayShouldReturnOutputStringArray() {

        String arr[]={"Aniket","20","20000"};
        //the member information method should contain a String,integer and integer parameters
        //These parameters must be called into a child(Extended) class as an array
        String[] actualResult=member.memberInformation("Aniket",20,20000);
        assertArrayEquals(arr,actualResult);
    }

    @Test
    public void givenAStringArrayShouldReturnErrorIfStringArrayDataIsNotMatching() {
     //In this test, the output will be an error if in case the String value is passed in an array instead of some other datatype
     //Checks whether the actual result is matching the expected output
        String arr[]={"Aniket","Vijay","20000"};

        String[] actualResult=member.memberInformation("Aniket",20,20000);

        assertEquals("The given String Data was not correct",actualResult);
    }

    @Test
    public void givenAStringArrayShouldReturnErrorIfStringHasNull() {
        //If any of the entered input String is null, it should return an error message
        String arr[]={null,"20","20000"};
        String[] actualResult=member.memberInformation(null,20,20000);
        assertNotNull(actualResult);
        assertEquals("The String Value should not be a null",actualResult);
    }




}