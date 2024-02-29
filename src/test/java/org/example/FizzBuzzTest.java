package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FizzBuzzTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FizzBuzzTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testFizz() {
        assertEquals("1",FizzBuzz.fizzBuzz(1));
        assertEquals("2",FizzBuzz.fizzBuzz(2));
        assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
    }
}
