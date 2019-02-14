package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {

    @Test
    public void testDefaultConstructor() {
        // When
        Person person = new Person();

        // Then
        Assert.assertNull(person.getName());
        Assert.assertEquals(0, person.getAge());
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAllFields() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Julian";
        String expectedGender = "male";
        String expectedEyeColor = "brown";
        String expectedHairColor = "brown";
        Integer expectedBirthYear = 1990;
        Boolean expectedIsAdult = true;


        // When
        Person person = new Person(expectedName, expectedAge, expectedGender, expectedEyeColor,expectedHairColor,
                expectedBirthYear,expectedIsAdult);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualGender = person.getGender();
        String actualEyeColor = person.getEyeColor();
        String actualHairColor = person.getHairColor();
        Integer actualBirthYear = person.getBirthYear();
        Boolean actualIsAdult = person.getIsAdult();


        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedBirthYear, actualBirthYear);
        Assert.assertEquals(expectedIsAdult, actualIsAdult);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEyeColorTest() {
        // Given
        Person person = new Person();
        String expected = "brown" ;

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEyeColorTest() {
        // Given
        String expected = "blue" ;
        Person person = new Person(null,0, null, expected,null,
                null, null);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGenderTest() {
        // Given
        Person person = new Person();
        String expected = "male" ;

        // When
        person.setGender(expected);

        // Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGenderTest() {
        // Given
        String expected = "male" ;
        Person person = new Person(null,0,expected,null,null,
                null, null);


        // Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHairColorTest() {
        // Given
        String expected = "black" ;
        Person person = new Person();

        // When
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHairColorTest() {
        // Given
        String expected = "black" ;
        Person person = new Person(null,0,null,null,expected,
                null, null);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthYearTest() {
        // Given
        Integer expected = 1990;
        Person person = new Person();

        // When
        person.setBirthYear(expected);

        // Then
        Integer actual = person.getBirthYear();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBirthYearTest() {
        // Given
        Integer expected = 2019;
        Person person = new Person(null,0,null,null,null,
                expected, null);

        // Then
        Integer actual = person.getBirthYear();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAdultTest() {
        // Given
        Boolean expected = true;
        Person person = new Person();

        // When
        person.setAdult(expected);

        // Then
        Boolean actual = person.getIsAdult();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIsAdultTest() {
        // Given
        Boolean expected = false;
        Person person = new Person(null,0,null,null,null,
                null, expected);

        // Then
        Boolean actual = person.getIsAdult();
        Assert.assertEquals(expected, actual);
    }


}
