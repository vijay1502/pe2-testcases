package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StringReverseAndPalindromeCheckTest {
    StringReverseAndPalindromeCheck reverseAndPalindrome;
    @Before
    public void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        reverseAndPalindrome = new StringReverseAndPalindromeCheck();

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        reverseAndPalindrome = null;

    }


    //This test checks for palindrome and returns related output
    @Test
    public void givenAStringShouldReturnPalindrome(){

        String actualResult=this.reverseAndPalindrome.reverseAndPalindromeMethod("oxo");
        assertEquals("Given String is a palindrome",actualResult);

    }
    //this test case checks for anti-palindrome strings and related output will be rendered
    @Test
    public void givenAStringShouldReturnCounterPalindromeString(){

        String actualResult=this.reverseAndPalindrome.reverseAndPalindromeMethod("Mishra");
        assertEquals("Given String is not a palindrome",actualResult);

    }
    //If a given integer or string is a single value, it should return an error message
    @Test
    public void givenASingleIntegerShouldReturnError(){

        String actualResult=this.reverseAndPalindrome.reverseAndPalindromeMethod("a");
        assertEquals("The given input does not have multiple inputs to check for palindrome",actualResult);
    }

    //If
    @Test
    public void givenANullStringShouldReturnError(){
        String actualResult=this.reverseAndPalindrome.reverseAndPalindromeMethod(null);
        assertNotNull(actualResult);
        assertEquals("null is not allowed",actualResult);
    }




    }