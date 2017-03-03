/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Shanty
 */
public class Student extends Person{
    private LocalDate enrollmentdate;
    private int studentNumber;
    private boolean isgood;
    private String major;
    
    public Student(String firstname, String lastname, String streetaddress, String city, String province, String postalcode, LocalDate birthdate,String course,int studentNumber,LocalDate enrollmentdate) {
        super(firstname, lastname, streetaddress, city, province, postalcode, birthdate);
        setBirthday(birthdate);
       this.studentNumber=studentNumber;
       major=course;
       isgood=true;
       this.enrollmentdate=enrollmentdate;
       
    }
    
    public int getYearEnrolled(){
        
        int yearenrolled=enrollmentdate.getYear();
        
        
        return  yearenrolled;
    }
    public int 	getYearsAtCollege(){
        LocalDate year=LocalDate.now();
        int a=Period.between( enrollmentdate,year).getYears();
        return a;
    }
    public void setBirthday(LocalDate birthdate){
        
         LocalDate year1=LocalDate.now();
        int ageatsenrolled=Period.between(birthdate,year1).getYears();
        
        if(ageatsenrolled>14 && ageatsenrolled<90 ){
            birthdate=Birthdate;
        }else {
            throw new IllegalArgumentException("age should be between 14-90");
        }
    }
    
    
    public boolean inGoodStanding(){
        if(isgood==true){
            return true;
        }else{
            return false;
        }
       
    }

    public String getMajor() {
        return major;
    }
    public boolean reinstateStudent(){
           isgood=true;
               return isgood;
           
       } 
     public boolean suspendStudent(){
         isgood=false;
               return isgood;
           }
public void setStudentNumber(int studentNumber) 
    {
        this.studentNumber = studentNumber;
        if(studentNumber <= 0)
            throw new IllegalArgumentException("Student number must be greater than 0");
        
        
    }


    public LocalDate getEnrollmentdate() {
        return enrollmentdate;
    }

   
    public LocalDate getBirthday() {
            LocalDate birthday=Birthdate;
        return birthday;
    }

    public void setEnrollmentdate(LocalDate enrollmentdate) {
        this.enrollmentdate = enrollmentdate;
    }

    public void setIsgood(boolean isgood) {
        this.isgood = isgood;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    

    public boolean isIsgood() {
        return isgood;
    }
    @Override
    public String toString() {
        return super.toString()+"student number is"+studentNumber;
    }
     

    
    
    
  
}