package io.zipcoder;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.junit.Assert;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

    @Test
    public void constructorTest(){
        // given
        Double[] examScores = {100.0};
        Student student = new Student("Alex", "Bozzini", examScores);
        String expectedFirstName = "Alex";
        String expectedLastName = "Bozzini";
        Double expectedExamScore = 100.0;
        // when
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        Double actualExamScore = examScores[0];
        // then
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedExamScore, actualExamScore);
    }

    @Test
    public void nullaryConstructorTest(){
        // given
        Student student = new Student();
        String expectedFirstName = "First";
        String expectedLastName = "Last";
        ArrayList<Double> expectedExamScores = null;
        // when
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        ArrayList<Double> actualExamScores = student.getExamScores();
        // then
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void getFirstNameTest(){
        // given
        Double[] examScores = {};
        Student student = new Student("Alex", "Bozzini", examScores);
        String expected = "Alex";
        // when
        String actual = student.getFirstName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastNameTest(){
        // given
        Double[] examScores = {};
        Student student = new Student("Alex", "Bozzini", examScores);
        String expected = "Bozzini";
        // when
        String actual = student.getLastName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScoresAsStringTest(){
        // given
        String firstName = "Alex";
        String lastName = "Bozzini";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n" + "\tExam 1 -> 100\n" + "\tExam 2 -> 95\n" + "\tExam 3 -> 123\n" + "\tExam 4 -> 96\n";
        // when
        String actual = student.getExamScoresAsString();
        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setFirstNameTest(){
        // given
        Student student = new Student();
        String expected = "Alex";
        // when
        student.setFirstName("Alex");
        String actual = student.getFirstName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setLastNameTest(){
        // given
        Student student = new Student();
        String expected = "Bozzini";
        // when
        student.setLastName("Bozzini");
        String actual = student.getLastName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfExamsTaken(){
        // given
        Double[] examScores = {87.3, 70.1, 64.7};
        Student student = new Student("", "", examScores);
        Integer expected = 3;
        // when
        Integer actual = student.getNumberOfExamsTaken();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScoreTest(){
        // given
        String firstName = "Alex";
        String lastName = "Bozzini";
        Double[] examScores = {};
        Student student = new Student(firstName, lastName, examScores);
        // when
        student.addExamScore(100.0);
        String output = student.getExamScoresAsString();
        // then
        System.out.println(output);
    }

    @Test
    public void setExamScore(){
        // given
        String firstName = "Alex";
        String lastName = "Bozzini";
        Double[] examScores = {100.0, 50.0, 100.0, 50.0};
        Student student = new Student(firstName, lastName, examScores);
        // when
        student.setExamScore(1, 150.0);
        String output = student.getExamScoresAsString();
        // then
        System.out.println(output);
    }

    @Test
    public void getAverageExamScoreTest(){
        // given
        String firstName = "Alex";
        String lastName = "Bozzini";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);
        // when
        Double output = student.getAverageExamScore();
        // then
        System.out.println(output);
    }

    @Test
    public void toStringTest(){
        // given
        String firstName = "Alex";
        String lastName = "Bozzini";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);
        // when
        String output = student.toString();
        // then
        System.out.println(output);
    }

}