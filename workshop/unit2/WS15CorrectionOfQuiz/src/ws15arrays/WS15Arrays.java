/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws15arrays;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class WS15Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalOfCustomers = 0;
        String [] names;
        int [] agesOfCustomers;
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println(" Enter the number of the customer ->");
        totalOfCustomers = scanner.nextInt();
        
        names = new String[totalOfCustomers];
        agesOfCustomers = new int [totalOfCustomers];
                
       for (int i = 0; i< totalOfCustomers; i++){
            scanner.nextLine();
            System.out.println(" Please Enter the name of the customer # " + i + " -> ");
            names [i] = scanner.nextLine();
            System.out.println(" Please enter " + names [i] + "age of customer ->");
            agesOfCustomers[1] = scanner.nextInt();
        }
        System.out.println(" names    -> \t    age of customers");
        for (int i = 0; i <totalOfCustomers; i++){
            System.out.println(names[i] + " ->  \t" + agesOfCustomers[i]);
        }
   }
}

