/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.fantasySagas.contoller;

/**
 *
 * @author Augusto
 */
public class Sorting {
    
private String name;
 
 public Sorting (String name){
     this.name = name;
 }
   
   public int comoparetTo(Sorting sorting1){
       return this.name.compareToIgnoreCase(sorting1.name);
       
   } 
   @Override
   public String toString(){
       return name;
   }
}
