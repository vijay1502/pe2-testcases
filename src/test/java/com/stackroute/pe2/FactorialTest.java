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
        String[] actualResult=factorial.factorialFunction(2);
        String[] array= {"factorial of 1 is 1","factorial of 2 is 2"};
        //assert
        assertArrayEquals(array,actualResult);
    }
    //AS the given method is to be written for 32-bit integer, the method should fail if it exceeds 21 digits
    @Test
    public void givenAnIntegerInputShouldReturnErrorMessage(){
        //act

        String[] actualResult=factorial.factorialFunction(21);
        String[] array= {"Array Limit out of bounds,as it exceeded 32 bit integer"};
        //assert
        assertArrayEquals(array,actualResult);
    }
    //Factorial does not allow negative integers, so an errorshould be displayed
    @Test
    public void givenANegativeIntegerInputShouldReturnErrorMessage(){
        //act

        String[] actualResult=factorial.factorialFunction(-2);
        String[] array= {"Array doesnot have negative values"};
        //assert
        assertArrayEquals(array,actualResult);
    }

    // The below functions are written for 64-bit integer outputs.
    // *****************************************************

    @Test
    public void givenAnIntegerInputShouldReturnStringArrayOfFactorialValues(){
        //act

        String[] actualResult=factorial.factorial64Bit(2);
        String[] array= {"factorial of 1 is 1","factorial of 2 is 2"};
        //assert
        assertArrayEquals(array,actualResult);
    }




}