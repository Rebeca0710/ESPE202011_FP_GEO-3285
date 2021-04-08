/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.University.controller;

import Utils.FileManager;
import ec.edu.espe.University.model.University;

/**
 *
 * @author Sony
 */
class UniversityController {
     public void save(University university){
        
        String data = university.getName() + ";" + university.getsubjects() + ";" + university.getAge() + ";" + university.getsemesters() + ";" + university.getClass();
        FileManager.save(data, "university");
        
    }    
     public String read(){
         String data;
         data = FileManager.read("university");
         return data;
         
         
}
}