/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.educationsystem.model;

/**
 *
 * @author Augusto
 */
public class HighSchool {
    public String getnumberOfStudents;
    public String getnumberOfTeachers;

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public class HihgSchool{
        private String name;
        private String location;
        private int numberOfStudents;
        private int numberOfTeachers;

        public HihgSchool(String name, String location, int numberOfStudents, int numberOfTeachers) {
            this.name = name;
            this.location = location;
            this.numberOfStudents = numberOfStudents;
            this.numberOfTeachers = numberOfTeachers;
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

        /**
         * @return the numberOfTeachers
         */
        public int getNumberOfTeachers() {
            return numberOfTeachers;
        }

        /**
         * @param numberOfTeachers the numberOfTeachers to set
         */
        public void setNumberOfTeachers(int numberOfTeachers) {
            this.numberOfTeachers = numberOfTeachers;
        }
        

    }
    
}
