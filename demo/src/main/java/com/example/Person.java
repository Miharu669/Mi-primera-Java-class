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
        if (firstName == null || lastName == null || idNumber == null || countryOfBirth == null) {
            throw new NullPointerException("Fields cannot be null");
        }
        if (gender != 'H' && gender != 'M' && gender != 'O') {
            throw new IllegalArgumentException("Gender must be 'H', 'M', or 'O'");
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
        if (firstName == null) {
            throw new NullPointerException("First name cannot be null");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new NullPointerException("Last name cannot be null");
        }
        this.lastName = lastName;
    }

    public void setIdNumber(String idNumber) {
        if (idNumber == null) {
            throw new NullPointerException("ID number cannot be null");
        }
        this.idNumber = idNumber;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        if (countryOfBirth == null) {
            throw new NullPointerException("Country of birth cannot be null");
        }
        this.countryOfBirth = countryOfBirth;
    }

    public void setGender(char gender) {
        if (gender != 'H' && gender != 'M' && gender != 'O') {
            throw new IllegalArgumentException("Gender must be 'H', 'M', or 'O'");
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

    public void printPersonDetails() {
        System.out.println("Person Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Country of Birth: " + countryOfBirth);
        System.out.println("Gender: " + gender);
    }

}
