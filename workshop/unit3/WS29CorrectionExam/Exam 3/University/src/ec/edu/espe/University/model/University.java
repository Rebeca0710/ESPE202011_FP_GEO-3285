/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.University.model;

/**
 *
 * @author Sony
 */
public class University {

      
    private String name;
    private String subjects;
    private String chosencareer;
    private int age;
    private float semesters;

    public University(String name, String subjects, String chosencareer, int age, float semesters) {
        this.name = name;
        this.subjects = subjects;
        this.chosencareer = chosencareer;
        this.age = age;
        this.semesters= semesters;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the subjects
     */
    public String getsubjects() {
        return subjects;
    }

    /**
     * @param chosencareer to set
     */
    public void chosencareer(String chosencareer) {
        this.chosencareer = chosencareer;
    }

  
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param semesters the age to set
     */
    public void semesters(int semesters) {
        this.semesters = semesters;
    }

    /**
     * @return the semesters
     */
    public float getsemesters() {
        return semesters;
    }

    /**
     * @param semesters the Weight to set
     */
    public void setsemesters(float semesters) {
        this.semesters= semesters;
    }
    
    
}
