package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void constructorTest(){
        // given
        Student student = new Student("Alex", "Bozzini", null);
        String expectedFirstName = "Alex";
        String expectedLastName = "Bozzini";
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
        Student student = new Student("Alex", "Bozzini", null);
        String expected = "Alex";
        // when
        String actual = student.getFirstName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastNameTest(){
        // given
        Student student = new Student("Alex", "Bozzini", null);
        String expected = "Bozzini";
        // when
        String actual = student.getLastName();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScoresTest(){
        // given
        ArrayList<Double> list = new ArrayList<>();
        list.add(87.3);
        list.add(70.1);
        list.add(64.7);
        Student student = new Student("Alex", "Bozzini", list);
        ArrayList<Double> expected = list;
        // when
        ArrayList<Double> actual = student.getExamScores();
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
        ArrayList<Double> list = new ArrayList<>();
        list.add(87.3);
        list.add(70.1);
        list.add(64.7);
        Student student = new Student("", "", list);
        Integer expected = 3;
        // when
        Integer actual = student.getNumberOfExamsTaken();
        // then
        Assert.assertEquals(expected, actual);
    }

}