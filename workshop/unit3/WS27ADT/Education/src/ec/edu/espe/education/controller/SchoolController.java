/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.education.controller;

import ec.edu.espe.education.model.School;
import utils.FileManager;

/**
 *
 * @author Augusto
 */
public class SchoolController {
    public void save (School school){
       String data = school.getName() + ";" + school.getLocation() + ";" + school.getZone() + ";" + ";" + school.getCircuit() + ";" + school.getNumberOfStudents();
       FileManager.save(data,"schools");
}
    public String  read (){
        String data;
        data = FileManager.read(".csv");
        return data;
    }
}
