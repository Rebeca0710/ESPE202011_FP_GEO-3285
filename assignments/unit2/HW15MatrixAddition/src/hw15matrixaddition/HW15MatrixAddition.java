/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw15matrixaddition;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class HW15MatrixAddition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int a11;
        int a12;
        int a13;
        int a21;
        int a22;
        int a23;
        int a31;
        int a32;
        int a33;
        int b11;
        int b12;
        int b13;
        int b21;
        int b22;
        int b23;
        int b31;
        int b32;
        int b33;
        System.out.println(" Enter the vaule of a11 -> ");
        a11 = input.nextInt();
        System.out.println(" Enter the value of a12 -> ");
        a12 = input.nextInt();
        System.out.println(" Enter the value of a13 -> ");
        a13 = input.nextInt();
        System.out.println(" Enter the value of a21 -> ");
        a21 = input.nextInt();
        System.out.println(" Enter the value of a22 -> ");
        a22 = input.nextInt();
        System.out.println(" Enter the value of a23 -> ");
        a23 = input.nextInt();
        System.out.println(" Enter the value of a31 -> ");
        a31 = input.nextInt();
        System.out.println(" Enter the value of a32 -> ");
        a32 = input.nextInt();
        System.out.println(" Enter the value of a33 -> ");
        a33 = input.nextInt();
        System.out.println(" Enter the value of b11 -> ");
        b11 = input.nextInt();
        System.out.println(" Enter the value of b12 -> ");
        b12 = input.nextInt();
        System.out.println(" Enter the value of b13 -> ");
        b13 = input.nextInt();
        System.out.println(" Enter the value of b21 -> ");
        b21 = input.nextInt();
        System.out.println(" Enter the value of b22 -> ");
        b22 = input.nextInt();
        System.out.println(" Enter the value of b23 -> ");
        b23 = input.nextInt();
        System.out.println(" Enter the value of b31 -> ");
        b31 = input.nextInt();
        System.out.println(" Enter the value of b32 -> ");
        b32 = input.nextInt();
        System.out.println(" Enter the value of b33 -> ");
        b33 = input.nextInt();
        
        int a[][] = {{a11, a12, a13}, {a21, a22, a23}, {a31, a32, a33}};
        int b[][] = {{b11, b12, b13}, {b21, b22, b23}, {b31, b32, b33}};
     
        int c[][] = new int[3][3];
        
        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The additon of matrix A -> ");
        
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + a[i][j]);
            }
        }
        
        System.out.println("\nAnd Matrix B -> ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + b[i][j]);
            }
        }

        System.out.println("\nequals to -> ");
                for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }
    }

}
    

