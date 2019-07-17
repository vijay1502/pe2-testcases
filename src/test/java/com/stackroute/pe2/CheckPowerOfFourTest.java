package com.stackroute.pe2;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPowerOfFourTest {
    CheckPowerOfFour chekpowr;
    @Before
    public void setUp() throws Exception {
        this.chekpowr = new CheckPowerOfFour();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void givenInputNumberAndCheckPowerOfFour() {

        //act

        String actualresult =  this.chekpowr.checkPower(16);

        //assert

        assertEquals("Yes it is power of four", actualresult);
    }
    @Test
    public void givenInputNumberAndCheckItIsNotPowerOfFour() {

        //act

        String actualresult =  this.chekpowr.checkPower(15);

        //assert

        assertEquals("It is not power of four", actualresult);
    }
}