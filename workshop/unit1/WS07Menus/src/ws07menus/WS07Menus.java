/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws07menus;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    boolean mainLoop = true;
    int option;
  
    
    do{
        System.out.println("Calculator");
        System.out.println("1. -> residue ");
        System.out.println("2. -> subtraction");
        System.out.println("3. -> multication");
        System.out.println("4. -> division");
        System.out.println("5. -> exit");
        
        System.out.println("Enter your menu option -->");
        option = input.nextInt();
        
        switch(option){
            
            case 1:
                int residue;
                int var1;
                int var2;
                System.out.println("eneter var1 --> ");
                var1 = input.nextInt();
                System.out.println("enter var2 --> ");
                var2 = input.nextInt();
                residue = var1 % var2;
                System.out.println("the residue is -->" + residue);
                break;
            case 2:
                int minuend;
                int subtraend;
                int subtraction;
                System.out.println("enter minuend ->");
                minuend = input.nextInt();
                System.out.println("enter subtraction ->");
                subtraend = input.nextInt();
                subtraction = minuend - subtraend;
                System.out.println("the subtraction is" + subtraction);
                break; 
            case 3:
                int multiplying;
                int multiplier;
                int multiplication;
                System.out.println("enter multiplying ->");
                multiplying = input.nextInt();
                System.out.println("enter the multiplier ->");
                multiplier = input.nextInt();
                multiplication = multiplying * multiplier;
                System.out.println("the multiplication is" + multiplication);
                break;
            case 4:
                int dividend;
                int divider;
                int division;
                System.out.println("enter dividend ->");
                dividend = input.nextInt();
                System.out.println("enter divider ->");
                divider = input.nextInt();
                division = dividend / divider;
                System.out.println("the dividion is" + division);
            case 5:
                System.out.println("Good bye my frind");
                System.exit(0);
                break;
            default:              
                System.out.println("Invalid option");
                break;
                
                
                
                                           
               
                
                
                
                
    }}while (option < 7);
        
        }  
      }
    
    
    

