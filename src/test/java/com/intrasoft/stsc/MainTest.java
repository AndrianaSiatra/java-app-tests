package com.intrasoft.stsc;

import org.junit.Assert;
import org.junit.Test;

import static com.intasoft.stsc.Main.checkValid;
import static com.intasoft.stsc.Main.getAverage;


public class MainTest {

    //checkValid

    @Test
    public void checkValidInsertingIntegerTest(){

        Assert.assertTrue(checkValid("10"));

    }

    @Test
    public void checkValidInsertingDoubleTest(){

        Assert.assertTrue(checkValid("10.3"));

    }
    @Test
    public void checkValidInsertingInvalidDemicalTest(){

        Assert.assertTrue(checkValid("10.61"));

    }
    @Test
    public void checkValidInsertingTextTest(){

        Assert.assertTrue(checkValid("54"));

    }

    @Test
    public void countAverageInsertingIntegersHavingDoubleTest(){

        Assert.assertTrue(getAverage("5","4")==4.5);
    }
    @Test
    public void countAverageInsertingIntegersHavingIntegerTest(){

        Assert.assertTrue(getAverage("5","13")==9);
    }

}
