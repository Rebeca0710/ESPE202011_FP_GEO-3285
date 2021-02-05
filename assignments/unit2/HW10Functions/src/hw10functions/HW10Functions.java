/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw10functions;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in); 
    double divide;
    double divid;
    double quotient;
    int number;
    int y;
    int x;
    int multiplie = 1;
    int multiplican = 0;
    int product;      
    int stop = 12;
    
    divide = input.nextInt();
    divid = input.nextInt();   
    number = input.nextInt();
    x = input.nextInt();
    multiplican = input.nextInt();
    
      //the difference call DifferenceBetweenTwoNumbers 
      System.out.println("=======================");
      quotient = DifferenceBetweenTwoNumbers (divide, divid);
            
      System.out.println(" The difference is "+ " " + quotient);
      
      
      System.out.println("=======================");
      y = f(number);
      System.out.println(" number^2 is " + " " + y);
      
      
      System.out.println("=======================");
      y = g(x);
      System.out.println(" The value of this is " + y);
      
      //the multiplication cal MultiplicationTable
      System.out.println("=======================");
      product= MultiplicationTable ( multiplican, multiplie);
      System.out.println(" The multiplication table is " );    
      for( multiplie=1;multiplie<=stop;multiplie++){
      product = multiplican * multiplie;      
      System.out.println(multiplican + " x " + multiplie + " = " + product);
            
       }  
      
    }
    public static double DifferenceBetweenTwoNumbers (double dividend, double divider){
        double quotient = 0.0F;
        
        quotient = dividend / divider;
        
        return quotient; 
                               
    }
    public static int f(int number){
        int y = 0;
        
        y = number * number;
        
        return y;
    
    }
     public static int g(int x){
        int y = 0;
        
        y = x * x  * x + 2 * x + 2;
        
        return y;
    }
 
   
     public static int MultiplicationTable ( int multiplicand, int multiplier){
         int product = 0;
                       
         product = multiplicand * multiplier; 
                            
         return product;
    }  
     
}

     
             
        
  








    