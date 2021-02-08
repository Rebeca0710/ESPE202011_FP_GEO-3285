/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw11.pkg1recursion;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class HW111Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("=====================");        
    int n,x,y,z = 0,w;
    n = input.nextInt();
    x = -1;
    y = 1;
        showSeries(z, n, x, y);
    }    

    private static void showSeries(int z, int n, int x, int y) {
        int w;
        for (z = 0; z<=n; z++){
            w = x + y;
            System.out.println(w + " ");
            x = y;
            y = w;
        }
    }
}
