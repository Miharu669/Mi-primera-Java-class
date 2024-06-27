package com.example;

public class Person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthYear;
    private String countryOfBirth;
    private char gender;

    public Person(String firstName, String lastName, String idNumber, int birthYear, String countryOfBirth,
            char gender) {
        if (gender != 'F' && gender != 'M' && gender != 'O') {
            throw new IllegalArgumentException("Gender must be 'F', 'M', or 'O'");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public void setGender(char gender) {
        if (gender != 'F' && gender != 'M' && gender != 'O') {
            throw new IllegalArgumentException("Gender must be 'F', 'M', or 'O'");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", birthYear=" + birthYear +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", gender=" + gender +
                '}';
    }
}