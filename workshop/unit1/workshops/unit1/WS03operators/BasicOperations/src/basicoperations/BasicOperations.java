/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicoperations;

/**
 *
 * @author Augusto
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        
        int minuend;
        int subtrahend;
        int difference;
        
        
        int multiplication;
        int multiplying;
        int multiplier;
        
        
        int division;
        int dividend;
        int divider;
        
        
        int residue;
        int var1;
        int var2;
        
        
        var1 = 8;
        var2 = 12;
        
     
        dividend = 27;
        divider = 9; 
       
        multiplying = 5;
        multiplier = 7;
        
        
        minuend = -23;
        subtrahend = -6; 
        
        
        addend1 = 5;
        addend2 = 18;
        
        
        sum = addend1 + addend2;
        System.out.println("The addition of" + addend1 + " + " + addend2 + 
                "is equal to -->" + sum);
        
        minuend = minuend - subtrahend;
        System.out.println("The subtraction of" + minuend + " - " + subtrahend + 
                "is equal to" +(minuend - subtrahend));
        
        multiplication = multiplying * multiplier;
        System.out.println("the multliplication of" + multiplying + " * " +
                multiplier + "is equal to" + (multiplying * multiplier));
        
        division = dividend / divider;
        System.out.println("The division of" + dividend + " / " + divider +
                "is equal to" + (dividend / divider));
        
       residue = var1 % var2;
       System.out.println("the residue of" + var1 + " % " + var2 + 
               "is equal to" + (var1 % var2));
                
        ++sum;
        System.out.println("sum is equal to-->" + sum);
        sum++;
        System.out.println("sum is equal to -->" + sum);
        System.out.println("adding one to sum" + (sum++));
        System.out.println("adding one to sum" + ((++sum)));
        
        
        
        
        
    }
    
}
