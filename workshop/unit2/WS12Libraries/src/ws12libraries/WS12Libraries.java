/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws12libraries;

/**
 *
 * @author Augusto
 */
public class WS12Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        float squareRoot = 0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;
        float absoluteValue;
        
        number = 9;
        squareRoot = (float)Math.sqrt(number);
        System.out.println("The square root of -> " + number + "<- is ->" + squareRoot);
        
        number = 49;
        squareRoot = (float)Math.sqrt(number);
        System.out.println("The square root of -> " + number + "<- is ->" + squareRoot);
        
        number = 5;
        squareRoot = (float)Math.sqrt(number);
        System.out.println("The square root of -> " + number + "<- is ->" + squareRoot);
        
        base = 3;
        exponent = 2;
        power = (float)Math.pow(base , exponent);
        System.out.println("The power is ->" + base + " raised to " + exponent + " is " + power);
        
        base = 2;
        exponent = 4;
        power = (float)Math.pow(base , exponent);
        System.out.println("The power is ->" + base + " raised to " + exponent + " is " + power);
        
        base = 78;
        exponent = 5;
        power = (float)Math.pow(base , exponent);
        System.out.println("The power is ->" + base + " raised to " + exponent + " is " + power);
        
        power = computePower(base, exponent);
        System.out.println("the power is" + base + " ^ " + exponent + " = " + power);
        
        absoluteValue = getAbsoluteValue(number);
        number = -5;
        System.out.println("absolute Value of " + number + " is " + absoluteValue);
                           
}
    public static float computePower(float base, float exponent){
        float power;
        power = 0.0F;
        for (int i=1; i <= (int)exponent; i++){
            power = power * base;
        }
        return power;
    
}
    private static float getAbsoluteValue( float number){
        if (number < 0){
            return -number;
        }else{
            return number;
        }
    }

}