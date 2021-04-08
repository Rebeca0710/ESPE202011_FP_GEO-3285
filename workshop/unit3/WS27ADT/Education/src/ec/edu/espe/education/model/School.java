/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.education.model;

/**
 *
 * @author Augusto
 */
public class School {
    private String name;
    private String location;
    private int zone;
    private int circuit;
    private int numberOfStudents;

    public School(String name, String location, int zone, int circuit, int numberOfStudents) {
        this.name = name;
        this.location = location;
        this.zone = zone;
        this.circuit = circuit;
        this.numberOfStudents = numberOfStudents;
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
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the zone
     */
    public int getZone() {
        return zone;
    }

    /**
     * @param zone the zone to set
     */
    public void setZone(int zone) {
        this.zone = zone;
    }

    /**
     * @return the circuit
     */
    public int getCircuit() {
        return circuit;
    }

    /**
     * @param circuit the circuit to set
     */
    public void setCircuit(int circuit) {
        this.circuit = circuit;
    }

    /**
     * @return the numberOfStudents
     */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /**
     * @param numberOfStudents the numberOfStudents to set
     */
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    
}
