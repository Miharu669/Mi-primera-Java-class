package com.example;

public final class App {

    private App() {

    }

    public static void main(String[] args) {
        Person person1 = new Person("Vero", "Doel", "123456789", 1989, "Spain", 'M');
        Person person2 = new Person("Paco", "Perez", "987654321", 1965, "Portugal", 'H');

        person1.printPersonDetails();
        person2.printPersonDetails();
    }
}