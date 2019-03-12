package io.zipcoder;

import java.util.*;

public class Classroom implements Comparator<Student> {
    private Student[] students;
    private Integer maxNumberOfStudents;

    public Classroom(Integer maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        this.students = new Student[30];
    }

    public String getStudents(){
        StringBuilder builder = new StringBuilder();
        for(Student s : students){
            builder.append("========================\n");
            try{
                builder.append(s.toString());
            }
            catch (Exception e){
                builder.append("No Students Enrolled\n");
            }
            builder.append("========================\n\n");
        }
        return builder.toString();
    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        for (Student s : students){
            sum += s.getAverageExamScore();
        }
        return sum / students.length;
    }

    public void addStudent(Student student){
        List<Student> studentsList = new ArrayList<>(Arrays.asList(students));
        studentsList.add(student);
        studentsList.remove(null);
        students = studentsList.toArray(new Student[0]);
    }

    public void removeStudent(String firstName, String lastName){
        List<Student> studentList = new ArrayList<>(Arrays.asList(students));
        for (Student s : studentList){
            if (s.getFirstName().equalsIgnoreCase(firstName) && s.getLastName().equalsIgnoreCase(lastName)){
                studentList.remove(s);
                break;
            }
        }
        studentList.sort(this);
        students = studentList.toArray(new Student[0]);
    }

    public ArrayList<Student> getStudentByScore(){
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(students));
        studentList.sort(this);
        return studentList;
    }

    public String getGradeBook(){
        Map<String, ArrayList<Student>> gradeBook = new TreeMap<>();
        ArrayList<Student> sortedStudentList = getStudentByScore();
        Integer binSize = sortedStudentList.size()/5;
        gradeBook.put("A", new ArrayList<>(sortedStudentList.subList(0, binSize)));
        gradeBook.put("B", new ArrayList<>(sortedStudentList.subList(binSize, binSize * 2)));
        gradeBook.put("C", new ArrayList<>(sortedStudentList.subList(binSize * 2, binSize * 3)));
        gradeBook.put("D", new ArrayList<>(sortedStudentList.subList(binSize * 3, binSize * 4)));
        gradeBook.put("F", new ArrayList<>(sortedStudentList.subList(binSize * 4, binSize * 5)));

        StringBuilder builder = new StringBuilder();
        for(Map.Entry entry : gradeBook.entrySet()){
            builder.append("" + entry.getKey() + " Students: \n\n\n" + entry.getValue().toString() + "\n");
        }
        return builder.toString();
    }

    @Override
    public int compare(Student s1, Student s2) {
        if (s2.getAverageExamScore().compareTo(s1.getAverageExamScore()) == 0){
            return s1.getLastName().compareTo(s2.getLastName());
        }
        return s2.getAverageExamScore().compareTo(s1.getAverageExamScore());
    }
}
