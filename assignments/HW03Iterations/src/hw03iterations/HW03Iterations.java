/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw03iterations;

/**
 *
 * @author Augusto
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i = 1;
        
    System.out.println(" The number of file");
   
    while (i<=40){
        System.out.println(" i is --> " + i);
        i = i + 1; 
    }
    
    System.out.println("Multication tables : 40");
    int top = 12;
    int product = 0;
    int table = 40;
    for(int j = 1; j<=top;j++){
        product = table * j;
        System.out.println("40 * " + j + " = " + product);   
    }
    
    System.out.println("Sum of 10 first even numbers ");
    int stop = 20;
    int sum = 0;
    int addition = 1;
    for(int j = 1; j<stop;j+=2){
        sum = addition + j;
        System.out.println("even number --> " + sum);
    }
    
 
    
    
   }
}