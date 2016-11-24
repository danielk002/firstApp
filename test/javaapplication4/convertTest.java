/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1507179
 */
public class convertTest {
    
    public convertTest() {
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
     * Test of rot13convert method, of class convert.
     */
    @Test
    public void testRot13convert() {
        System.out.println("rot13convert");
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        convert instance = new convert();
        String expResult = "NOPQRSTUVWXYZABCDEFGHIJKLM";
        String result = instance.rot13convert(input);
        assertEquals(expResult, result);
    }
    
}
