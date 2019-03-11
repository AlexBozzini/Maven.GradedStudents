package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    @Test
    public void maxStudentsConstructorTest(){
        // given
        Classroom classroom = new Classroom(40);
        Integer expected = 40;
        // when
        Integer actual = classroom.getMaxNumberOfStudents();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMaxNumberOfStudentsTest(){
        // given
        Classroom classroom = new Classroom(40);
        Integer expected = 40;
        // when
        Integer actual = classroom.getMaxNumberOfStudents();
        // then
        Assert.assertEquals(expected, actual);
    }

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
}
