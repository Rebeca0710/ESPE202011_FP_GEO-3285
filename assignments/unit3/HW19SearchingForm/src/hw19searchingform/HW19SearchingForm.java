/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw19searchingform;

import java.awt.Event;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Augusto
 */
public class HW19SearchingForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int  elements;
        int aux;
        elements = Integer.parseInt(JOptionPane.showInputDialog(" Enter the characters of rhe array that you want "));
        
        int [] numbers = new int [elements];
        
        System.out.println(" Type the elements of the arrangement ");
        for (int i = 0; i< elements; i++){
            System.out.println((i+1) + ". type a character ");
            aux = input.nextInt();
            numbers [i] = aux;
        }
        
          for (int i = 0; i < numbers.length -1; i++){
              for (int j = i +1; j < numbers.length; j++){
                  if (numbers[j] < numbers[i]){
                      aux = numbers[i];
                      numbers[i] = numbers[j];
                      numbers[j] = aux;
                  }
              }
                  
          }
          System.out.println(" \n order");
          for(int i = 0; i < numbers.length; i++){
              System.out.println( numbers[i] + "  ");
          }

         }
          
        } 
    



    

    

