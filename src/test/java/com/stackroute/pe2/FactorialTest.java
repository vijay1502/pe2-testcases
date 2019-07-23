package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

       Factorial factorial;
        @Before
        public void setup() {
            // This methods runs, before running any one of the test case
            // This method is used to initialize the required variables
            factorial = new Factorial();

        }

        @After
        public void teardown() {
            // This method runs, after running all the test cases
            // This method is used to clear the initialized variables
            factorial = null;

        }
        //Tests for factorial and gives the output array for inputted number
        @Test
        public void givenAnIntegerInputShouldReturnFactorialInStringArray(){
       //act
        //input parameter should be an integer inside factoriaLFunction
        String actualResult=factorial.factorialMethod(5);
        String expectedResult= "factorial of 5 is 120";
        //assert
        assertEquals(expectedResult,actualResult);
    }
    //AS the given method is to be written for 32-bit integer, the method should fail if it exceeds 21 digits
    @Test
    public void givenAnIntegerInputShouldReturnErrorMessage(){
        //act

        String actualResult=factorial.factorialMethod(13);
        String expectedResult= "The output range is greater than 32 bit";
        //assert
        assertEquals(expectedResult,actualResult);
    }
    //Factorial does not allow negative integers, so an errorshould be displayed

}