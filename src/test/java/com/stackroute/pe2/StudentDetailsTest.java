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
        int actualresult =  this.stdntdtl.checkStudentDetailAvg(marks);

        //assert

        assertEquals(20, actualresult);
    }
    @Test
    public void givenInvalidStudentDetailShouldReturnMinimumMarks(){

        //act
        int[] marks= {10,20,30};
        int actualresult =  this.stdntdtl.checkStudentDetailMin(marks);

        //assert

        assertEquals(10, actualresult);
    }
    @Test
    public void givenInvalidStudentDetailShouldReturnMaximumMarks(){

        //act
        int[] marks= {10,20,30};
        int actualresult =  this.stdntdtl.checkStudentDetailMax(marks);

        //assert

        assertEquals(30, actualresult);
    }

}