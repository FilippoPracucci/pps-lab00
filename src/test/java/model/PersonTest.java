package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Bob", 33);
    }

    @Test
    void testGetName() {
        final String expectedName = "Bob";
        assertEquals(expectedName, person.getName());
    }

    @Test
    void testGetAge() {
        final int expectedAge = 33;
        assertEquals(expectedAge, person.getAge());
    }

    @Test
    void testUpdateAge() {
        final int updatedAge = 34;
        person.updateAge(updatedAge);
        assertEquals(updatedAge, person.getAge());
    }

    @Test
    void testMultipleUpdatesAge() {
        final int numberOfUpdates = 3;
        int updatedAge = person.getAge();
        for (int i = 0; i < numberOfUpdates; i++) {
            updatedAge++;
            person.updateAge(updatedAge);
        }
        assertEquals(updatedAge, person.getAge());
    }
}