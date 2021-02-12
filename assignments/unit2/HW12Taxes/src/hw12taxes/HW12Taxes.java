/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw12taxes;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("====== Welcome to the calculetor of taxes =======");
        System.out.println("=================================================");
        System.out.println("=================== Income Tax ==================");
    float incomeTax;
    float taxedIncome;
    float refund;
    float discounts;
    float costs;
    float expenses;
    float deductions;
    float deductiblesExpenses; 
    float fractionTax = 0;
    float taxBase = 0;
    float surplus;
    System.out.println(" Enter a value of taxed income ");
    taxedIncome = input.nextInt();
    System.out.println(" Enter a value of refund");
    refund = input.nextInt();
    System.out.println(" Enter a value of discounts");
    discounts = input.nextInt();
    System.out.println(" Enter a value of costs");
    costs = input.nextInt();
    System.out.println(" Enter a value of expenses");
    expenses = input.nextInt();
    System.out.println(" Enter a value of deductions");
    deductions = input.nextInt();
    deductiblesExpenses = refund + discounts + costs + expenses + deductions;
    incomeTax = showFractionTax(taxedIncome, deductiblesExpenses, taxBase, fractionTax);    
    taxBase = taxedIncome - deductiblesExpenses;    
    System.out.println(" The tax base is -> " + taxedIncome + " - " + (deductiblesExpenses) + 
            " is equals to -> " + taxBase + " = " + incomeTax);
                    
    System.out.println("=================================================");
    System.out.println("======================= IVA =====================");
    System.out.println("=================================================");
    float IVA;
    float var;
    float number;
    float var1;
    float var2;
    number = (float)1.12;
    System.out.println(" Enter a value for IVA ");
    var = input.nextInt();
    var1 = var / number;
    var2 = var - var1;
    IVA = var2; 
     System.out.println(" The IVA is ->" + (var + " / " + number + " -> " + var1 
            + " = " + var + " - " + var1 + " = ")+ IVA);
     
    System.out.println("=================================================");
    System.out.println("=========== Foreign exchange outflow ============");
    System.out.println("=================================================");
    float foreignExchangeOutflow;
    float number1 = 5;
    float numb = 100;
    float number2;
    System.out.println(" Enter a value of comsuptions");
    number2 = input.nextInt();   
    foreignExchangeOutflow = number2 * number1 / numb;
    System.out.println(" The foreign exchange outflow is " + number2 +
            " * " + number1 + " / " + numb + " = " + foreignExchangeOutflow );                  
}
    public static float showFractionTax (float taxedIncome,float deductiblesExpenses, float taxBase, float fractionTax ){
        float num;
        taxBase = taxedIncome - deductiblesExpenses;  
        fractionTax = taxBase; 
        num = fractionTax;       
        float incomeTax;
                              
        if ( fractionTax == 0 || fractionTax <= 11290){
            return 0;                      
        } 
        if (fractionTax <= 11290 || fractionTax <= 14390){
            return 0;                            
        }
        if (fractionTax <= 14390 || fractionTax <= 17990){
            return 155;                                    
        }
        if (fractionTax <= 17990 || fractionTax <= 21600){
            return 515;                       
        }
        if (fractionTax <= 21600 || fractionTax <= 43190){
            return 948;   
        }
        if (fractionTax <= 43190 || fractionTax <= 64770){
            return 4187;  
        }
        if (fractionTax <= 64770 || fractionTax <= 86370){
            return 8503;                      
        }
        if (fractionTax <= 86370 || fractionTax <= 115140){
            return 13903;  
        }   
        if (fractionTax <= 115140 || fractionTax > 115140){
            return 22535;                     
        }              
    
        return num;
    }
  }

 

 

 
    
    


      


           