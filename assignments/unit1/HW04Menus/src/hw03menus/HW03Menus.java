/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw03menus;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class HW03Menus {

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
        System.out.println("1. -> the area of a rhomboid");
        System.out.println("2. -> the area of a triangle");
        System.out.println("3. -> the area of a square");
        System.out.println("4. -> the area of a rhomb");
        System.out.println("5. -> exit");
        
        System.out.println("Enter your menu option -->");
        option = input.nextInt();
        
        switch (option){
            
            case 1:
                int area;
                int base;
                int height;
                System.out.println("enter base ->");
                base = input.nextInt();
                System.out.println("enter height ->");
                height = input.nextInt();
                area = base * height;
                System.out.println("the area is -->" + area);
                break;
            case 2:
                int area2;
                int base2;
                int height2;
                System.out.println("enter base2 ->");
                base2 = input.nextInt();
                System.out.println("enter height2 ->");
                height2 = input.nextInt();
                area2 = base2 * height2 / 2;
                System.out.println("the area2 is -->" + area2);
                break;
            case 3:
                int area3;
                int side1;
                int side2;
                System.out.println("enter side1 ->");
                side1 = input.nextInt();
                System.out.println("enter side2 ->");
                side2 = input.nextInt();
                area3 = side1 * side2;
                System.out.println("the area3 is -->" + area3);
                break;
            case 4:
                int area4;
                int mdiagonal; 
                int diagonalm;
                System.out.println("enter mdiagonal ->");
                mdiagonal = input.nextInt();
                System.out.println("enter diagonalm ->");
                diagonalm = input.nextInt();
                area4 = mdiagonal * diagonalm / 2;
                System.out.println("the area4 is -->" + area4);
                break;
            case 5:
                System.out.println("Good bye");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                break;
                
                
                
                
        }}while(option < 8);
    
              
                                            
        }
    }
    

