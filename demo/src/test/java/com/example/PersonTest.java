package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PersonTest {

    @Test
    void testPersonConstructorAndGetters() {
        Person person = new Person("Vero", "Doell", "12345678", 1989, "Spain", 'M');

        assertEquals("Vero", person.getFirstName());
        assertEquals("Doell", person.getLastName());
        assertEquals("12345678", person.getIdNumber());
        assertEquals(1989, person.getBirthYear());
        assertEquals("Spain", person.getCountryOfBirth());
        assertEquals('M', person.getGender());
    }

    @Test
    void testSetters() {
        Person person = new Person("Paco", "Perez", "87654321", 1965, "Portugal", 'H');

        person.setFirstName("Paco");
        person.setLastName("Garcia");
        person.setIdNumber("11223344");
        person.setBirthYear(1992);
        person.setCountryOfBirth("Mexico");
        person.setGender('O');

        assertEquals("Paco", person.getFirstName());
        assertEquals("Garcia", person.getLastName());
        assertEquals("11223344", person.getIdNumber());
        assertEquals(1992, person.getBirthYear());
        assertEquals("Mexico", person.getCountryOfBirth());
        assertEquals('O', person.getGender());
    }

    @Test
    void testInvalidGenderInConstructor() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Person("Vero", "Doell", "12345678", 1989, "Spain", 'X');
        });
        assertEquals("Gender must be 'H', 'M', or 'O'", exception.getMessage());
    }

    @Test
    void testInvalidGenderInSetter() {
        Person person = new Person("Paco", "Perez", "87654321", 1965, "Portugal", 'H');

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setGender('X');
        });
        assertEquals("Gender must be 'H', 'M', or 'O'", exception.getMessage());
    }

    @Test
    void testToString() {
        Person person = new Person("Maria", "Iglesias", "99999999", 2000, "UK", 'M');
        String expected = "Person{firstName='Maria', lastName='Iglesias', idNumber='99999999', birthYear=2000, countryOfBirth='UK', gender=M}";
        assertEquals(expected, person.toString());
    }

    void testPrintPersonDetails() {
        Person person = new Person("Vero", "Doell", "12345678", 1989, "Spain", 'M');

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        person.printPersonDetails();

        String expectedOutput = "Person Details:\n" +
                "First Name: Vero\n" +
                "Last Name: Doell\n" +
                "ID Number: 12345678\n" +
                "Birth Year: 1989\n" +
                "Country of Birth: Spain\n" +
                "Gender: M\n";

        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);
    }

    @Test
    void testMinimumBirthYear() {
        Person person = new Person("Vero", "Doel", "12345678", Integer.MIN_VALUE, "Spain", 'M');
        assertEquals(Integer.MIN_VALUE, person.getBirthYear());
    }

    @Test
    void testMaximumBirthYear() {
        Person person = new Person("Vero", "Doel", "12345678", Integer.MAX_VALUE, "Spain", 'M');
        assertEquals(Integer.MAX_VALUE, person.getBirthYear());
    }

    @Test
    void testNullFirstName() {
        assertThrows(NullPointerException.class, () -> {
            new Person(null, "Doel", "12345678", 1989, "Spain", 'M');
        });
    }

    @Test
    void testNullLastName() {
        assertThrows(NullPointerException.class, () -> {
            new Person("Vero", null, "12345678", 1989, "Spain", 'M');
        });
    }

    @Test
    void testNullIdNumber() {
        assertThrows(NullPointerException.class, () -> {
            new Person("Vero", "Doel", null, 1989, "Spain", 'M');
        });
    }

    @Test
    void testNullCountryOfBirth() {
        assertThrows(NullPointerException.class, () -> {
            new Person("Vero", "Doel", "12345678", 1989, null, 'M');
        });
    }

    @Test
    void testSetNullFirstName() {
        Person person = new Person("Vero", "Doel", "12345678", 1989, "Spain", 'M');
        assertThrows(NullPointerException.class, () -> {
            person.setFirstName(null);
        });
    }

    @Test
    void testSetNullLastName() {
        Person person = new Person("Vero", "Doel", "12345678", 1989, "Spain", 'M');
        assertThrows(NullPointerException.class, () -> {
            person.setLastName(null);
        });
    }

    @Test
    void testSetNullIdNumber() {
        Person person = new Person("Vero", "Doel", "12345678", 1989, "Spain", 'M');
        assertThrows(NullPointerException.class, () -> {
            person.setIdNumber(null);
        });
    }

    @Test
    void testSetNullCountryOfBirth() {
        Person person = new Person("Vero", "Doel", "12345678", 1989, "Spain", 'M');
        assertThrows(NullPointerException.class, () -> {
            person.setCountryOfBirth(null);
        });
    }

}
