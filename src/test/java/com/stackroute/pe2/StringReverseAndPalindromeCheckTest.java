package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverseAndPalindromeCheckTest {
    private StringReverseAndPalindromeCheck reverseAndPalindrome;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        reverseAndPalindrome = new StringReverseAndPalindromeCheck();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        reverseAndPalindrome = null;

    }

    @Test
    public void givenAStringShouldReturnReverseOfTheString(){
        //As we have already initialised the Object of class, let us call the methods
        //This method is meant to test whether the given string returns reverse of it or not
        String actualResult=this.reverseAndPalindrome.reverseMethod("Aniket");

        assertEquals("tekinA",actualResult);

    }
    @Test
    public void givenAStringShouldReturnPalindrome(){
        //As we have already initialised the Object of class, let us call the methods
        String actualResult=this.reverseAndPalindrome.reverseMethod("oxo");
        assertEquals("Given String is a palindrome",actualResult);

    }
    @Test
    public void givenAStringShouldReturnErrorIfNotAPalindromeString(){
        //As we have already initialised the Object of class, let us call the methods
        String actualResult=this.reverseAndPalindrome.reverseMethod("Mishra");
        assertEquals("Given String is not a palindrome",actualResult);

    }


    }