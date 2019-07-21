package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadTextFileTest {
    ReadTextFile rdtxtfile;
    @Before
    public void setUp() throws Exception {
        this.rdtxtfile= new ReadTextFile();
    }

    @After
    public void tearDown() throws Exception {
        rdtxtfile=null;
    }
    @Test
    public void givenTextFileAndShouldRetrunTheLengthOfFile(){

        //act
        String filePath="C:\\Users\\pankaj\\Desktop\\test.txt";
        int lengthOfFile=14;
        String content="this is aniket";
        int actualresult =  rdtxtfile.readLength(filePath,lengthOfFile,content);

        //assert

        assertEquals(lengthOfFile, actualresult);

    }
    @Test
    public void givenTextFileAndShouldReadTheContentInUpperCase(){

        //act
        
        String filePath="C:\\Users\\pankaj\\Desktop\\test.txt";
        int lengthOfFile=14;
        String content="this is aniket";
        String actualresult =  rdtxtfile.readContent(filePath,lengthOfFile,content);

        //assert

        assertEquals("THIS IS ANIKET", actualresult);
    }
}