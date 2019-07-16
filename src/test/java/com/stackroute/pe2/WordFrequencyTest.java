package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFrequencyTest {
    private static WordFrequency wordFrequency;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        wordFrequency = new WordFrequency();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        wordFrequency = null;

    }

    @Test
    public void givenAStringShouldReturnFrequencyCountOfTheString(){
        //act
        String[] arr={"i->3 times","am-1","like -1","have -1","a-2"};
        String[] actualResult=wordFrequency.wordRepeatitionMethod("i am a man, i like to sleep ,i have a home");
        assertArrayEquals(arr,actualResult);
    }

}