/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ooweek10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hessel
 */
public class PolynomialsTest {
    
    public PolynomialsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Polynomials.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Polynomials p = null;
        Polynomials instance = null;
        instance.add(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class Polynomials.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        Polynomials p = null;
        Polynomials instance = null;
        instance.substract(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Polynomials.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Polynomials p = null;
        Polynomials instance = null;
        instance.multiply(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apply method, of class Polynomials.
     */
    @Test
    public void testApply() {
        System.out.println("apply");
        double x = 0.0;
        Polynomials instance = null;
        double expResult = 0.0;
        double result = instance.apply(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Polynomials.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Polynomials instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
