package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTestTest {
   private EvenNumberTest evenNumberTest;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        evenNumberTest = new EvenNumberTest();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        evenNumberTest = null;

    }


    @Test
    public void givenAnIntegerInputShouldReturnBooleanOutputAsTrueIfEven() {
        //This method should test for whether the given integer input is giving even output or not
        boolean actualResult=this.evenNumberTest.isEven(4);
        assertEquals(true,actualResult);

    }

    @Test
    public void givenAnIntegerInputShouldReturnBooleanOutputAsFalseIfOdd() {
        //This method should test for whether the given integer input is giving even output or not
        boolean actualResult=this.evenNumberTest.isEven(5);
        assertEquals(false,actualResult);

    }

    @Test
    public void givenANegativeIntegerInputShouldReturnBooleanOutputAsTrueIfEven() {
        //This method should test for whether the given integer input is giving even output or not
        boolean actualResult=this.evenNumberTest.isEven(-4);
        assertEquals(true,actualResult);

    }

    @Test
    public void givenANegativeIntegerInputShouldReturnBooleanOutputAsFalseIfOdd() {
        //This method should test for whether the given integer input is giving even output or not
        boolean actualResult=this.evenNumberTest.isEven(-7);
        assertEquals(false,actualResult);

    }

    @Test
    public void givenAnIntegerInputAsZeroShouldReturnBooleanOutputAsEven() {
        //This method should test for whether the given integer input is giving even output or not
        boolean actualResult=this.evenNumberTest.isEven(0);
        assertEquals(true,actualResult);

    }
}