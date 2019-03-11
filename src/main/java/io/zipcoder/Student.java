package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public Student(){
        this.firstName = "First";
        this.lastName = "Last";
        this.examScores = null;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public ArrayList<Double> getExamScores(){
        return examScores;
    }

    public String getExamScoresAsString(){
        Student student = new Student();
        String output = "Exam Scores:\n";
        for(int i= 0; i < examScores.size(); i++){
           output += "\tExam " + (i + 1) + " -> " + Math.round(examScores.get(i)) + "\n";
        }
        return output;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){
        return this.getExamScores().size();
    }



}
