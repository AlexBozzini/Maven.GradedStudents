package io.zipcoder;

public class Classroom {
    private Student[] students;
    private Integer maxNumberOfStudents;

    public Classroom(Integer maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        this.students = new Student[30];
    }

    public Integer getMaxNumberOfStudents(){
        return maxNumberOfStudents;
    }

    public String getStudents(){
        String output = "List of Students:\n";
        for(Student s : students){
            output += "\t" + s.getFirstName() + " " + s.getLastName() + "\n";
        }
        return output;
    }

    public Double getAverageExamScore(){
        return null;
    }
}
