/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Shanty
 */
 /**
     * This is my constructor that accepts arguments in the following order: first name, last name, street address, city,
     * province, postal code, birthday, employee number and hire date. 
     * @param first
     * @param last
     * @param address
     * @param cityName
     * @param provinceName
     * @param pinCode
     * @param birthday
     * @param employeeNumber
     * @param dateOfHiring 
     */
public class Instructor extends Person {
    private int employeenum;
    private LocalDate hiredate;
   private ArrayList<String> course;
    public Instructor(String firstname, String lastname, String streetaddress, String city, String province, String postalcode, LocalDate birthdate,int employeenum,LocalDate hiredate) {
        super(firstname, lastname, streetaddress, city, province, postalcode, birthdate);
     this.hiredate=hiredate;
     this.employeenum=employeenum;
     
    
        
    }  /**
     * This method will store all the teachable courses in array list 
     */
    public void addTeachableCourse(String coursecode){
        coursecode.toUpperCase();
        course.add(coursecode);
    }
      /**
     * This method will  receives a course code as an argument return yes or  false otherwise
     */
    public boolean canTeach(String coursecode){
        if(course.contains(coursecode)){
            return true;
        }else{
            return false;
        }
    }
/* retrun employeenum*/
    public int getEmployeenum() {
        return employeenum;
    }
/* retrun hiredate*/
    public LocalDate getHiredate() {
        return hiredate;
    }
/* retrun arraylist*/
    public ArrayList<String> getCourse() {
        return course;
    }/*this method return years tutor is in the college*/
    public int getYearsAtCollege(){
         LocalDate current=LocalDate.now();
         int yearsatcollege=Period.between(hiredate, current).getYears();
         return yearsatcollege;
    }
   
     /*this method set the birthday if age is between 18-100years*/
    
    public void setBirthday(LocalDate birthday){
        LocalDate year=LocalDate.now();
       int bornyear=Period.between(year,birthday).getYears(); 
       if(bornyear<18){
           throw new IllegalArgumentException("ageshould be over 18 to teach others ");
       }else if(bornyear>100){
           throw new IllegalArgumentException("ageshould be less than 100 years to teach others ");
       }else {
           birthday=Birthdate;
       }
    }
    /*method will set the hire date */
     public void setHireDate(LocalDate hiredate){
        LocalDate now=LocalDate.now();
       int yearsfromhire=Period.between(now,hiredate).getYears(); 
       if(yearsfromhire>80){
           throw new IllegalArgumentException("its time to retire ");
       }else if(yearsfromhire<=0){
           throw new IllegalArgumentException("future exception ");
       }else {
            this.hiredate=hiredate;
       }
    }

    @Override/*will return returns the Instructor’s first name, last name and employee number*/
    public String toString() {
        return "Firstname="+FirstName+"lasrname="+LastName+"employeenum="+employeenum;
    }
     
    
       
     
}
