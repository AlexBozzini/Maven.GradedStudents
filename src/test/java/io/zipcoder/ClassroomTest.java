package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getStudentsTest(){
        // given
        Double[] examScores = {};
        Student student1 = new Student("Alex", "Bozzini", examScores);
        Student student2 = new Student("Wilhem", "Alcivar", examScores);
        Student[] students = {student1, student2};
        Classroom classroom = new Classroom(students);
        // when
        String output = classroom.getStudents();
        // then
        System.out.println(output);
    }

    @Test
    public void getAverageExamScoreTest(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("Alex", "Bozzini", s1Scores);
        Student s2 = new Student("Wilhem", "Alcivar", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void addStudentTest(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student s1 = new Student("Alex", "Bozzini", examScores);

        // When
        String preEnrollment = classroom.getStudents();
        classroom.addStudent(s1);
        String postEnrollment = classroom.getStudents();

        // Then
        System.out.println(preEnrollment);
        System.out.println(postEnrollment);
    }

    @Test
    public void removeStudentTest(){
        // given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {50.0, 100.0};

        Student s1 = new Student("Alex", "Bozzini", s1Scores);
        Student s2 = new Student("Wilhem", "Alcivar", s2Scores);

        Student[] students = new Student[]{s1, s2};
        Classroom classroom = new Classroom(students);
        String preRemoval = classroom.getStudents();
        // when
        classroom.removeStudent("Wilhem", "Alcivar");
        String postRemoval = classroom.getStudents();
        // then
        System.out.println(preRemoval);
        System.out.println(postRemoval);
    }

    @Test
    public void getStudentByScore(){
        // given
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {50.0, 100.0};
        Double[] s3Scores = {80.0, 110.0};

        Student s1 = new Student("Alex", "Bozzini", s1Scores);
        Student s2 = new Student("Wilhen", "Alcivar", s2Scores);
        Student s3 = new Student("Andrew", "Telepak", s3Scores);

        Student[] students = new Student[]{s1, s2, s3};
        Classroom classroom = new Classroom(students);
        // when
        String sortedStudents = classroom.getStudentByScore().toString();
        // then
        System.out.println(sortedStudents);
    }

    @Test
    public void getGradeBookTest(){
        // given
        Double[] s1Scores = {10.0, 10.0};
        Double[] s2Scores = {20.0, 20.0};
        Double[] s3Scores = {30.0, 30.0};
        Double[] s4Scores = {40.0, 40.0};
        Double[] s5Scores = {50.0, 50.0};
        Double[] s6Scores = {60.0, 60.0};
        Double[] s7Scores = {70.0, 70.0};
        Double[] s8Scores = {80.0, 80.0};
        Double[] s9Scores = {90.0, 90.0};
        Double[] s10Scores = {100.0, 100.0};

        Student s1 = new Student("Alex", "Bozzini", s1Scores);
        Student s2 = new Student("Wilhem", "Alcivar", s2Scores);
        Student s3 = new Student("Andrew", "Telepak", s3Scores);
        Student s4 = new Student("Ross", "Eckbold", s4Scores);
        Student s5 = new Student("Gigi", "Kaloustian", s5Scores);
        Student s6 = new Student("Kath", "Singh", s6Scores);
        Student s7 = new Student("Sofia", "Demopolos", s7Scores);
        Student s8 = new Student("Jenna", "Verdieck", s8Scores);
        Student s9 = new Student("Tara", "Lustair", s9Scores);
        Student s10 = new Student("Sara", "Rocco", s10Scores);

        Student[] students = new Student[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
        Classroom classroom = new Classroom(students);
        // when
        String gradeBook = classroom.getGradeBook();
        // then
        System.out.println(gradeBook);
    }
}
