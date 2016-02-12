/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javaapplication2.multiply;
import org.junit.Assert;
import java.util.NoSuchElementException;
/**
 *
 * @author rfazal.bscs13seecs
 */
public class javaapplication2test {
    
    public javaapplication2test() {
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
    public void testmult(){
    int matrix1[][] = new int[2][2];
    matrix1[0][0] = 1;
    matrix1[0][1] = 1;
    matrix1[1][0] = 1;
    matrix1[1][1] = 1;

    
        int matrix2[][] = new int[2][2];
    matrix2[0][0] = 1;
    matrix2[0][1] = 1;
    matrix2[1][0] = 1;
    matrix2[1][1] = 1;
    
    int C [][]=  new int[2][2];
    Assert.assertArrayEquals(C, matrix1);
    }
    public void testmultStrassen(){
    int matrix1[][] = new int[2][2];
    matrix1[0][0] = 1;
    matrix1[0][1] = 1;
    matrix1[1][0] = 1;
    matrix1[1][1] = 1;

    
        int matrix2[][] = new int[2][2];
    matrix2[0][0] = 1;
    matrix2[0][1] = 1;
    matrix2[1][0] = 1;
    matrix2[1][1] = 1;

    multiply matrixMultiplier = new multiply();
    
    int C [][]=  matrixMultiplier.StrassenMultiply(matrix1, matrix2);
    Assert.assertArrayEquals(C, matrix1);
    }

    /**
     * Test of main method, of class JavaApplication1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JavaApplication2.main(args);
        testmult();
        testmultStrassen();
        fail("The test case is a prototype.");
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
