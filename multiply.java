/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author rfazal.bscs13seecs
 */
public class multiply {
    void multiply(){}
 public  int[][]  StrassenMultiply(int[][] A, int[][] B)
    {        
        //Square Matrix
        int n = A.length;
        int[][] R = new int[n][n];
        /** base case for recursion **/
        if (n == 1)
            R[0][0] = A[0][0] * B[0][0];
        else
        {
            int[][] A11 = new int[n/2][n/2];
            int[][] A12 = new int[n/2][n/2];
            int[][] A21 = new int[n/2][n/2];
            int[][] A22 = new int[n/2][n/2];
            int[][] B11 = new int[n/2][n/2];
            int[][] B12 = new int[n/2][n/2];
            int[][] B21 = new int[n/2][n/2];
            int[][] B22 = new int[n/2][n/2];
 
            
            split(A, A11, 0 , 0);
            split(A, A12, 0 , n/2);
            split(A, A21, n/2, 0);
            split(A, A22, n/2, n/2);
            
            split(B, B11, 0 , 0);
            split(B, B12, 0 , n/2);
            split(B, B21, n/2, 0);
            split(B, B22, n/2, n/2);

            int [][] P1 = StrassenMultiply(addition(A11, A22), addition(B11, B22));
            int [][] P2 = StrassenMultiply(addition(A21, A22), B11);
            int [][] P3 = StrassenMultiply(A11, subtract(B12, B22));
            int [][] P4 = StrassenMultiply(A22, subtract(B21, B11));
            int [][] P5 = StrassenMultiply(addition(A11, A12), B22);
            int [][] P6 = StrassenMultiply(subtract(A21, A11), addition(B11, B12));
            int [][] P7 = StrassenMultiply(subtract(A12, A22), addition(B21, B22));
 
           
            int [][] C11 = addition(subtract(addition(P1, P4), P5), P7);
            int [][] C12 = addition(P3, P5);
            int [][] C21 = addition(P2, P4);
            int [][] C22 = addition(subtract(addition(P1, P3), P2), P6);
 
            join(C11, R, 0 , 0);
            join(C12, R, 0 , n/2);
            join(C21, R, n/2, 0);
            join(C22, R, n/2, n/2);
        }
        return R;
    }   
    public int[][] subtract(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }
    /** Adding matrices **/
    public int[][] addition(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }
    /** Splitting matrices **/
    public void split(int[][] P, int[][] C, int iB, int jB) 
    {
        for(int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                C[i1][j1] = P[i2][j2];
    }
    /** Joining matrices**/
    public void join(int[][] C, int[][] P, int iB, int jB) 
    {
        for(int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                P[i2][j2] = C[i1][j1];
    }
}
