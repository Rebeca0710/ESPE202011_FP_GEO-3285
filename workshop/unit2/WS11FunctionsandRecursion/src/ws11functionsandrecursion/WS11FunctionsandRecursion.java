/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws11functionsandrecursion;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class WS11FunctionsandRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
        double number;
        double operator;
        double operator2;
        double result;                                    
        double residue;
        double product;
        double stop =12;
        int option = 6 ; 
        double k = 0;
      do {
       
        System.out.print("Enter First Number: ");
          operator = teclado.nextInt();
        System.out.print("Enter Second Number: ");
          operator2 = teclado.nextInt();      
        System.out.println( " ================================ ");
          System.out.println( " Numbers Multiple of 2 ");
        if(operator % 2 == 0) {
            System.out.println(operator+" Even Number .");                      
        if(operator2 % 2 == 0) {
            System.out.println(operator2+" Even Number .");          
                    showMultiplication(operator, operator2);       
        }else{
            System.out.println(operator2+" NOT Even Number .");
        }
        }else {
            System.out.println(operator+" NOT Even Number .");
        }        
          System.out.println( " ================================ ");
          System.out.println( " Numbers Multiple of 3 ");
         
        if(operator % 3 == 0) {
            System.out.println(operator+" Multiple of 3 .");
                      
        if(operator2 % 3 == 0) {
            System.out.println(operator2+" Multiple of 3 .");           
                    showAddition(operator, operator2);       
          }else{
            System.out.println(operator2+" NOT Multiple of 3 .");
        }
        }else {
            System.out.println(operator+" NOT Multiple of 3 .");
        }        
          System.out.println( " ================================ ");         
          System.out.println( " Numbers Multiple of 7 ");
        if(operator % 7 == 0) {
            System.out.println(operator+" Multiple of 7 .");                     
        if(operator2 % 7 == 0) {
            System.out.println(operator2+" Multiple of 7 .");           
                    showModule(operator, operator2);          
        }else{
            System.out.println(operator2+" NOT Multiple of 7 .");
        }
        }else {
            System.out.println(operator+" NOT Multiple of 7 .");
        }       
           System.out.println( " ================================ ");
        
           System.out.println( " Numbers Multiple of 11 ");
        
            if(operator % 11 == 0) {
            System.out.println(operator+" Multiple of 11 .");
                      
        if(operator2 % 11 == 0) {
            System.out.println(operator2+" Multiple of 11 .");                           
                    showMultiplicationTables(k, stop, operator, operator2);
        }else{
            System.out.println(operator2+" NOT Multiple of 11 .");
        }
        }else {
            System.out.println(operator+" NOT Multiple of 11 .");
        }
      
        System.out.println( " ================================ ");
            
        System.out.println( " Numbers Multiple of 13 ");
         
        if(operator % 13 == 0) {             
        System.out.println(operator+" Multiple of 13 .");                         
         if(operator2 % 13 == 0) {             
        System.out.println(operator2+" Multiple of 13 .");                 
                    showDivision(operator, operator2);  
        }else{
            System.out.println(operator2 + " NOT Multiple of 13 .");  
        }
        }else{
            System.out.println(operator + " NOT Multiple of 13 .");            
        }             
        int numb = 5;
        int fact = 0;
        fact = factorial(numb);
        System.out.println("factorial of" + numb + "is equal to ->" + fact);
        
    }while (option != 6);     
  }

    private static void showDivision(double operator, double operator2) {
        double result;
        result = operator / operator2;
        System.out.println(" The Division between " + " " + operator + " / " + operator2 + " " +
                " is iqual to " + " " + (operator/ operator2));
    }

    private static void showMultiplicationTables(double k, double stop, double operator, double operator2) {
        double product;
        for (k = 1;k <= stop; k++) {
            product = k * operator;
            System.out.println(k+ " x " + operator + " = " + product);
        }
        for (k = 1;k <= stop; k++) {
            product = k * operator2;
            System.out.println(k+ " x " + operator2 + " = " + product);
        }
    }

    private static void showModule(double operator, double operator2) {
        double residue;
        residue = operator % operator2;
        System.out.println("The Module" + " " + operator + " % " + operator2 + " " +
                "is iqual to" + " " + (operator % operator2));
    }

    private static void showAddition(double operator, double operator2) {
        double result;
        result=operator+operator2;
        System.out.println( " The Add of "  + operator +  " + "  + operator2+ " Is equal to " + result);
    }

    private static void showMultiplication(double operator, double operator2) {
        double result;
        result=operator*operator2;
        System.out.println( " The Multiplicacion of "  + operator +  " * "  + operator2+ " Is Equal to  " + result);
    }

    public static int factorial(int n) {
        if (n <0){
            return -1;
        }else{
            if (n ==0){
                return 1;
            }
            return(n * factorial(n-1));
        }
    }
}



    

  