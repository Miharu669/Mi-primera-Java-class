package com.example;
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Vero", "Doel", "666666666", 1989, "Spain", 'F');
        System.out.println(person);
        System.out.println("Country of Birth: " + person.getCountryOfBirth());
        System.out.println("Gender: " + person.getGender());
    }
}


