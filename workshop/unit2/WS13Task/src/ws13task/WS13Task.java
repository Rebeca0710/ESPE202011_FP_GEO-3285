/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws13task;

import java.util.Scanner;

/**
 *
 * @author Augusto
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("======= Areas ========");
    System.out.println("===========================");
        printAreaTrapezoid(input);  
    System.out.println("===========================");
        showAreaComet(input);
    System.out.println("===========================");
        displayAreaHexagon(input);
    System.out.println("======= Physical formulas ======="); 
    System.out.println("===========================");
        showAcceleration(input);
    System.out.println("===========================");
        printHeight(input);
    System.out.println("===========================");
        printForce(input);
    }    

    private static void printForce(Scanner input) {
        System.out.println(" Force formula ");
        double force;
        double mass;
        double acceleration;
        System.out.println(" Enter m -> ");
        mass = input.nextInt();
        System.out.println(" Enter a -> ");
        acceleration = input.nextInt();
        force = mass * acceleration;
        System.out.println(" the force is ->" + mass + " * " + acceleration + " = " + force );
    }    

    private static void printHeight(Scanner input) {
        System.out.println(" Height formula ");
        double height;
        double initialVelocity;
        double time;
        double gravity = 9.8;
        double n = 0.5;     
        System.out.println(" Enter V0 -> ");
        initialVelocity = input.nextInt();
        System.out.println(" Enter time -> ");
        time = input.nextInt();
        height = (initialVelocity * time) + (n * gravity *( time * time));
        System.out.println(" the height is -> " + (initialVelocity + " * " + time) + 
                " + " + n + " * " + gravity + " * " + (time + "*" + time) + " = "+ height);
    }    

    private static void showAcceleration(Scanner input) {
        System.out.println(" Acceleration formula ");
        double acceleration;
        double initialVelocity;
        double finalVelocity;
        double time;
        double n = 2;
        System.out.println(" Enter V0 -> ");
        initialVelocity = input.nextInt();
        System.out.println(" Enter Vf -> ");
        finalVelocity = input.nextInt();
        System.out.println(" Enter t -> ");
        time = input.nextInt();
        acceleration = ((initialVelocity + finalVelocity) / n ) * time;
        System.out.println(" the acceleration is ->" + ((initialVelocity + " + " 
                + finalVelocity) + " / " + n) + " * " + time + " = " + acceleration);
    }    

    private static void displayAreaHexagon(Scanner input) {
        System.out.println(" The area of a hexagon ");
        double area3;
        double perimeter;
        double apothem;
        double n = 2;
        System.out.println(" Enter P -> ");
        perimeter = input.nextInt();
        System.out.println(" Enter a -> ");
        apothem = input.nextInt();
        area3 = (perimeter * apothem) / n;
        System.out.println(" the area of a hexagon is ->" + (perimeter + " * " + apothem) + " / " + n + " = " + area3);
    }    

    private static void showAreaComet(Scanner input) {
        System.out.println(" The area of a comet ");
        double area2;
        double diameter;
        double Diameter;
        double n = 2;
        System.out.println(" Enter D -> ");
        Diameter = input.nextInt();
        System.out.println(" Enter d -> ");
        diameter = input.nextInt();
        area2 = (Diameter * diameter) / 2;
        System.out.println(" the area of a comet is ->" + (Diameter + " * " + diameter) + " / " + n + " = " + area2 );
    }    

    private static void printAreaTrapezoid(Scanner input) {
        System.out.println(" The area of a trapezoid ");
        double area1;
        double height;
        double majorBase;
        double mainorBase;
        double n = 2;
        System.out.println("Enter a value of h ->");
        height = input.nextInt();
        System.out.println("Enter a value of B ->");
        majorBase = input.nextInt();
        System.out.println("Enter a value of b ->");
        mainorBase = input.nextInt();
        area1 = height * (majorBase + mainorBase) / n;
        System.out.println("the area of a trapezoid is ->" + height + " * " + 
                (majorBase + "+" + mainorBase) + " / " + n + " = " + area1);
    }
}
