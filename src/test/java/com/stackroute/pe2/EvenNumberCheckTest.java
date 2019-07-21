package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCheckTest {

    private EvenNumberCheck evenNumberCheck;
    @Before
    public void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        evenNumberCheck=new EvenNumberCheck();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        evenNumberCheck = null;

    }


    @Test
    public void givenAnIntegerInputShouldReturnBooleanOutputAsTrueIfEven() {
        //This method should test for whether the given integer input is giving even output or not
        boolean actualResult=this.evenNumberCheck.isEven(4);
        assertEquals(true,actualResult);

    }

    @Test
    public void givenAnIntegerInputShouldReturnBooleanOutputAsFalseIfOdd() {
        //This method should test for whether the given integer input is giving even output or not
        boolean actualResult=this.evenNumberCheck.isEven(5);
        assertEquals(false,actualResult);

    }

    @Test
    public void givenANegativeIntegerInputShouldReturnBooleanOutputAsTrueIfEven() {
        //This method should test for whether the given integer input is giving even output or not
        boolean actualResult=this.evenNumberCheck.isEven(-4);
        assertEquals(true,actualResult);

    }

    @Test
    public void givenANegativeIntegerInputShouldReturnBooleanOutputAsFalseIfOdd() {
        //This method should test for whether the given integer input is giving even output or not
        boolean actualResult=this.evenNumberCheck.isEven(-7);
        assertEquals(false,actualResult);

    }

    @Test
    public void givenAnIntegerInputAsZeroShouldReturnBooleanOutputAsEven() {
        //This method should test for whether the given integer input is giving even output or not
        boolean actualResult=this.evenNumberCheck.isEven(0);
        assertEquals(true,actualResult);

    }
}