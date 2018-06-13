package com.teja.QuickSort_Maven;

import java.util.Arrays;


import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Test;

public class SecondTest extends TestCase {
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SecondTest( String testName )
    {
        super( testName );
    }

   
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testOne()
    {
        assertTrue( Arrays.equals(new int[]{1,2,3}, new App().quickSort(new int[]{2,1,3})) );
        assertFalse( Arrays.equals(new int[]{1,1,1}, new App().quickSort(new int[]{2,2,3})) );
    }
    
    @Test
    public void testTwo(){
        //System.out.println("Executing third test");
        assertFalse( Arrays.equals(new int[]{1,1,1}, new App().quickSort(new int[]{2,2,3})) );
        assertTrue( Arrays.equals(new int[]{2,2,2,2,2,2}, new App().quickSort(new int[]{2,2,2,2,2,2})) );
    }
    
    @Test
    public void testThree(){
    	assertTrue( Arrays.equals(new int[]{}, new App().quickSort(new int[]{})) );
    }
}
