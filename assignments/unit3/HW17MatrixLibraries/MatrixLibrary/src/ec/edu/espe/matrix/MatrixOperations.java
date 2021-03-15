/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.matrix;

/**
 *
 * @author Augusto
 */
public class MatrixOperations {
 public static float[][] addTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float [m][n];
        
        for(int i=0; i< m; i++){
            for (int j=0; j< n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
     public static float[][] restTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] d;
        d = new float [m][n];
        
        for(int i=0; i< m; i++){
            for (int j=0; j< n; j++){
                d[i][j] = a[i][j] - b[i][j];
            }
        }
        return d;
     }
     public static float[][] multiplyTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] e;
        e = new float [m][n];
        
        for(int i=0; i< m; i++){
            for (int j=0; j< n; j++){
                e[i][j] = a[i][j] * b[i][j];
            }
        }
        return e;
     }   
}
