/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws21funtions;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class WS21Funtions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Pmd;
        double electrodeValue;
        double depositionEfficiency;
        double electrodecost;
        double annualCostPolicy;
        double kilometersTraveledAnnually;
        double annualinsurancecost;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println(" AUTOR : REBECA NICOLE SANDOVAL");
        System.out.println(" Vehicules ");
        System.out.println(" Electrode cost ");
        System.out.println(" Enter a value for Pmd -> " + "Kg/mL");
        Pmd = input.nextDouble();
        System.out.println (" Ente a value for electrode value -> " + "$/Kg");
        electrodeValue = input.nextDouble();
        System.out.println (" Enter a value for deposition efficiency -> " + "%");
        depositionEfficiency = input.nextDouble();
        
        electrodecost = electrodeCost(Pmd, electrodeValue, depositionEfficiency);
        System.out.println(" The value of Electode cost is ->" + electrodecost);
        
        System.out.println(" Annual insurance cost ");
        System.out.println(" Enter a value for annual cost of the policy -> ");
        annualCostPolicy = input.nextDouble();
        System.out.println(" Enetr a value for kilometers traveled annually -> ");
        kilometersTraveledAnnually = input.nextDouble();
        
        annualinsurancecost = annualInsuranceCost(annualCostPolicy, kilometersTraveledAnnually);
        System.out.println(" The value of Annual insurance cost is -> " + annualinsurancecost);
        
    }
    public static double electrodeCost (double Pmd, double electrodeValue, double depositionEfficiency ){
        double electrodeCos;
        electrodeCos = Pmd * electrodeValue / depositionEfficiency;
        return electrodeCos;
    }
    public static double annualInsuranceCost (double annualCostPolicy, double kilometersTraveledAnnually ){
        double annualCost;
        annualCost = annualCostPolicy / kilometersTraveledAnnually;
        return annualCost;
    }
}
