/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw08factorialnumber;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
    int factorial = 1;
    int number = 0;
    int stop = 15;
   
    do{
        System.out.println("The factorial number of -->");
                                
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
                            
        factorial = 1;      
        while(number !=0)
        {
        factorial *=number;
        number --;    
        }       
      System.out.println("the factorial number is" + factorial);
    
    }while (factorial !=0);
    System.out.println("Good bye");
  }
}