/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose luis
 */
public class SortsTest {
    
    public SortsTest() {
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
     * Test of Particion method, of class Sorts.
     */
    @Test
    public void testParticion() {
        System.out.println("Particion");
        int[] lista = null;
        int izq = 0;
        int der = 0;
        Sorts instance = new Sorts();
        int expResult = 0;
        int result = instance.Particion(lista, izq, der);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of QuickSort method, of class Sorts.
     */
    @Test
    public void testQuickSort() {
        System.out.println("QuickSort");
        int[] lista = new int[3];
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;
        int izq = 0;
        int der = 0;
        Sorts instance = new Sorts();
        int[] expResult = new int[3];
        expResult[0]=1;
        expResult[1]=2; 
        expResult[2]=3;
         
        int[] result = instance.QuickSort(lista, izq, der);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Merge method, of class Sorts.
     */
    @Test
    public void testMerge() {
        System.out.println("Merge");
        int[] primer = null;
        int[] segundo = null;
        int[] resultado = null;
        Sorts instance = new Sorts();
        instance.Merge(primer, segundo, resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MergeSort method, of class Sorts.
     */
    @Test
    public void testMergeSort() {
        System.out.println("MergeSort");
        int[] lista = new int[1] ;
        lista[0]=1;
        Sorts instance = new Sorts();
        int[] expResult = new int [1];
        expResult[0] = 1;
        int[] result = instance.MergeSort(lista);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of GnomeSort method, of class Sorts.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("GnomeSort");
        Estructura datos = null;
        Sorts instance = new Sorts();
        int[] expResult = null;
        int[] result = instance.GnomeSort(datos);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RadixSort method, of class Sorts.
     */
    @Test
    public void testRadixSort() {
        System.out.println("RadixSort");
        Estructura datos = null;
        Sorts instance = new Sorts();
        int[] expResult = null;
        int[] result = instance.RadixSort(datos);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
