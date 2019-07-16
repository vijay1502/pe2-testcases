package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MemberTest {

    private static MemberVariables member;
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
        String[] actualResult=member.memberInformation("Aniket",20,20000);
        assertArrayEquals(arr,actualResult);
    }

    @Test
    public void givenAStringArrayShouldReturnErrorIfStringArrayDataWasNotProperlyProvided() {

        String arr[]={"Aniket","Vijay","20000"};
        String[] actualResult=member.memberInformation("Aniket",20,20000);

        assertEquals("The given String Data was not correct",actualResult);
    }
}