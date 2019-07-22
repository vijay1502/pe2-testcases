package com.stackroute.pe2;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPowerOfFourTest {
    CheckPowerOfFour checkPower;
    @Before
    public void setUp() throws Exception {
        this.checkPower = new CheckPowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        checkPower=null;
    }

    @Test
    public void givenInputNumberAndCheckPowerOfFour() {

        //act

        String actualresult =  this.checkPower.checkPower(16);

        //assert

        assertEquals("Yes it is power of four", actualresult);
    }
    @Test
    public void givenInputNumberAndCheckItIsNotPowerOfFour() {

        //act

        String actualresult =  this.checkPower.checkPower(15);

        //assert

        assertEquals("It is not power of four", actualresult);
    }
}