package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDetailsTest {

    StudentDetails stdntdtl;

    @Before
    public void setUp() throws Exception {
        this.stdntdtl= new StudentDetails();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenStudentDetailShouldReturnAverage(){

        //act
        int[] marks= {10,20,30};
        String actualresult =  this.stdntdtl.checkStudentDetailAvg(3,marks);

        //assert

        assertEquals("Average of student marks is 20", actualresult);
    }
    @Test
    public void givenInvalidStudentDetailShouldReturnMinimumMarks(){

        //act
        int[] marks= {50,60,10};
        String actualresult =  this.stdntdtl.checkStudentDetailMin(3,marks);

        //assert

        assertEquals("Minimum mark is 10", actualresult);
    }
    @Test
    public void givenInvalidStudentDetailShouldReturnMaximumMarks(){

        //act
        int[] marks= {100,20,30};
        String actualresult =  this.stdntdtl.checkStudentDetailMax(3,marks);

        //assert

        assertEquals("Maximum mark is 100", actualresult);
    }
    @Test
    public void givenInvalidStudentDetailShouldReturnErrorIfLengthDoesNotMatch(){

        //act
        int[] marks= {100,20,30};
        String actualresult =  this.stdntdtl.checkStudentDetailMax(4,marks);

        //assert

        assertEquals("No.of Students and marks length are not matching", actualresult);
    }

}