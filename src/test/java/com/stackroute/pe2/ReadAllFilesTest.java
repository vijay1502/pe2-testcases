package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadAllFilesTest {
    ReadAllFiles readallfile;

    @Before
    public void setUp()  {
        this.readallfile= new ReadAllFiles();
    }

    @After
    public void tearDown() {
    }
    @Test
    public void givenFolderShouldReturnAllFiles(){

        //act
        String filePath="C:\\Users\\pankaj\\Desktop";
        int noOfFile=5;
        String fileName="hello.txt";
        int actualresult =  this.readallfile.readAllFiles(filePath,fileName);

        //assert

        assertEquals(noOfFile, actualresult);
    }


}