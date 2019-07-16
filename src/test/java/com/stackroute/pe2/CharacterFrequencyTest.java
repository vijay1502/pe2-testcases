package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterFrequencyTest {
    private static CharacterFrequency characterFrequency;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        characterFrequency = new CharacterFrequency();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        characterFrequency = null;

    }

    @Test
    public void givenAStringInputShouldReturnStringArrayOutput() {
        //This method should test the array elements of the given input String and find the frequency of every individual Alphabet
        String[] actualResult=this.characterFrequency.frequencyOfCharacter();
        assertEquals("[A-1,n-1, i-2, k-1,e-1, t-1, s-1, G-1, o-2,d-1]",actualResult);

    }


}