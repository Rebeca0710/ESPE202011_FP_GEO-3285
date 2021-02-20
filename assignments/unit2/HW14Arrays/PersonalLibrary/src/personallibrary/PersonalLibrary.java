/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personallibrary;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class PersonalLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========The Rebeca's libray======");
        int [] booksByShelf;
        String[] fantasyBooks = {"Red Queen", "Glass Sword", "king's Cage", "War Storn", "Broken Throne"};
        float [] weightsByBooks = {0.3F, 0.62F, 0.59F, 0.78F, 0.57F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of the section-> ");
        n = input.nextInt();
        
        booksByShelf = new int [n];
        //fantasyBooks = new String[5];
        //booksByShelf = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of the books os the library " + (i + 1) + " -> ");
            booksByShelf[i] = input.nextInt();
        } 
        
        for (int books : booksByShelf) {
            System.out.println("books of shelf are " + books);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("books of the shelf " + (i + 1) + " -> " + booksByShelf[i]);
        }
        
        for (String fantasyBook : fantasyBooks) {
            System.out.println("The name of the books" + " -> " + fantasyBook); 
        }
        
        for (int i = 0; i < weightsByBooks.length ; i++) {
            System.out.println("weight of coop " + (i + 1) + " -> " + weightsByBooks[i]);
        }
    }
}
