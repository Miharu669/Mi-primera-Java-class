package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testPersonConstructorAndGetters() {
        Person person = new Person("John", "Doe", "12345678", 1990, "USA", 'H');
        
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals("12345678", person.getIdNumber());
        assertEquals(1990, person.getBirthYear());
        assertEquals("USA", person.getCountryOfBirth());
        assertEquals('H', person.getGender());
    }

    @Test
    void testSetters() {
        Person person = new Person("Jane", "Doe", "87654321", 1985, "Canada", 'M');
        
        person.setFirstName("Janet");
        person.setLastName("Smith");
        person.setIdNumber("11223344");
        person.setBirthYear(1992);
        person.setCountryOfBirth("Mexico");
        person.setGender('O');
        
        assertEquals("Janet", person.getFirstName());
        assertEquals("Smith", person.getLastName());
        assertEquals("11223344", person.getIdNumber());
        assertEquals(1992, person.getBirthYear());
        assertEquals("Mexico", person.getCountryOfBirth());
        assertEquals('O', person.getGender());
    }

    @Test
    void testInvalidGenderInConstructor() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Person("John", "Doe", "12345678", 1990, "USA", 'X');
        });
        assertEquals("Gender must be 'H', 'M', or 'O'", exception.getMessage());
    }

    @Test
    void testInvalidGenderInSetter() {
        Person person = new Person("Jane", "Doe", "87654321", 1985, "Canada", 'M');
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setGender('X');
        });
        assertEquals("Gender must be 'H', 'M', or 'O'", exception.getMessage());
    }

    @Test
    void testToString() {
        Person person = new Person("Alice", "Johnson", "99999999", 2000, "UK", 'M');
        String expected = "Person{firstName='Alice', lastName='Johnson', idNumber='99999999', birthYear=2000, countryOfBirth='UK', gender=M}";
        assertEquals(expected, person.toString());
    }
}
