package com.teja.BubbleSort_Maven;

import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        //assertTrue( true );
    	assertTrue(Arrays.equals(new int[]{1,2,3}, new App().bubbleSort(new int[]{2,1,3})));
    	assertTrue(Arrays.equals(new int[]{}, new App().bubbleSort(new int[]{})));
    	assertFalse(Arrays.equals(new int[]{2,1,3}, new App().bubbleSort(new int[]{2,3,3})));
    }
}
