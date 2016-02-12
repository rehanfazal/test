# JavaApplication2.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
import javaapplication2.multiply;/**
 *
 * @author rfazal.bscs13seecs
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static int dimension;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter Matrix Dimensions: ");
        Scanner dim=new Scanner(System.in);
        dimension=dim.nextInt();
        int matrix1[][]= new int [dimension][dimension];
        Random randm=new Random();
        // First Matrix
        // Prints the matrix of random digits
        for (int i =0;i<dimension;i++) {
            for (int j = 0;j<dimension;j++) {
                matrix1[i][j]= randm.nextInt(100);
            }
        }
        System.out.println();
        System.out.println("First Matrix");
        for (int i =0;i<dimension;i++) {
            for (int j = 0;j<dimension;j++) {
               System.out.print(matrix1[i][j]+ " ");
            }
            System.out.println();
        }
        // Second Matrix
        // Prints the materix of random digits
        int matrix2[][]= new int [dimension][dimension];
        for (int i =0;i<dimension;i++) {
            for (int j = 0;j<dimension;j++) {
                matrix2[i][j]= randm.nextInt(100);
            }
        }
        System.out.println();
        System.out.println("Second Matrix");
        for (int i =0;i<dimension;i++) {
            for (int j = 0;j<dimension;j++) {
               System.out.print(matrix2[i][j]+ " ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Normal Multiplication");
       
       int[][] c = new int[dimension][dimension];
       for (int i = 0; i < dimension; i++) {
           for (int j = 0; j < dimension; j++) {
               for (int k = 0; k < dimension; k++) {
                   c[i][j] = c[i][j] + matrix1[i][k] * matrix2[k][j];
               }
           }
       }
       
       for (int i =0;i<dimension;i++) {
            for (int j = 0;j<dimension;j++) {
               System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
       System.out.println();
       System.out.println("Stressen Multiplication");
       multiply multi= new multiply();
        int result[][]=new int [dimension][dimension];
        
        result = multi.StrassenMultiply(matrix1, matrix2);
        for (int i =0;i<dimension;i++) {
            for (int j = 0;j<dimension;j++) {
               System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
        
        
}
    
}
