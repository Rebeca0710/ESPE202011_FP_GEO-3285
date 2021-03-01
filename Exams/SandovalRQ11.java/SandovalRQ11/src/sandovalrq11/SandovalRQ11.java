/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sandovalrq11;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class SandovalRQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
    int [] addNumbers;    
    float [] numberAverage;
    int [] matrixEntero;
    int [][] a = {{12,23,34,98,87,65,0}};
    int n;
    int j;
    n = input.nextInt();
    j = input.nextInt();
    addNumbers = new int[n];
        for ( int i = 0; i < n; i++){ 
        System.out.println(" The addition is -> " + (i + 1) + " = " + ((i+1) + (j)));
    }
        {
    numberAverage = new float[3];
    float average;
       for (int p = 0; p <= 2; p++) {
            System.out.println (" Enter the elements " + (p + 1) + " = "); 
	    numberAverage [p] = input.nextFloat();
	}
	System.out.println (" the average is " + average (numberAverage));
	}
    }
	public static float average (float [] numberAverage){
	{
	float average = 0;
	    for (int i = 0; i <= 2; i++)
		average += numberAverage [i];
		return average/ numberAverage.length;
	}                   
    }
    
    public static int addNumbers (int n, int j, int c, int i){ 
      for ( i = 0; i < n; i++){ 
          c = (i + 1)+((i+1) + (j));
      }     
        return c;
    }        
}
    


