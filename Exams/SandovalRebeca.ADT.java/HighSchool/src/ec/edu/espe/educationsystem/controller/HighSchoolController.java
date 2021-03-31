/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.educationsystem.controller;

import ec.edu.espe.educationsystem.model.HighSchool;
import utils.FileManager;

/**
 *
 * @author Augusto
 */
public class HighSchoolController {
    public void save (HighSchool highschool){
     String data = highschool.getName() + ";" + highschool.getLocation() + ";" + highschool.getnumberOfStudents + ";" + highschool.getnumberOfTeachers; 
     FileManager.save(data,"highschools");
    }
    
}
