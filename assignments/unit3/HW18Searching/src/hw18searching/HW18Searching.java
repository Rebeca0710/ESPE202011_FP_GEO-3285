/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw18searching;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] elements = {20, 40, 16, 30, 45, 47, 69, 78, 25, 39};
    int  left = 0 ;
    int  right = 0;
    int  x;
    int search;
    int binarySearch;
    Scanner input = new Scanner (System.in);

        
        System.out.println(" Enter the number that you want to search");
        search = input.nextInt();
        System.out.println(" Enter x");
        x = input.nextInt();
        System.out.println("=======================================");
        System.out.println(" The search is " + search(elements, x));
        System.out.println("=======================================");
        System.out.println("");
        System.out.println(" Enter the number for the binary search");
        binarySearch = input.nextInt();
        System.out.println(" Enter x");
        x = input.nextInt();   
        System.out.println("=======================================");
        System.out.println(" The Binary search is " + binarySearch(elements, left, right, x));
        System.out.println("=======================================");
              
    }

        public static int search (int elements [], int x){
         int n = elements.length;
         
         for (int i = 0; i < n; i++)
         {
             if (elements [i] == x)
                 return i;
         }
         return -1;
         }
        public static int binarySearch (int elements[], int left, int right, int x){
        if (right >= left){
            int mid = left + (right - left) /2;
            
            if (elements[mid] == x)
                return mid;
            int[] arr = null;
            
            if (elements[mid] > x)
                return binarySearch (arr, left, mid -1, x);
            
            return binarySearch (elements, mid + 1, right, x);
        }
        return -1;   
        }
}
    
    
    

