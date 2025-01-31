package DogInfoTest;

import DogInfo.Dog;
import DogInfo.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

    @Test
    void testHasOldDog_True() {
        // Initialized a person with dog
        Person person = new Person("Harsha", 25, new Dog("pom", 12));

        assertTrue(person.hasOldDog());
    }

    @Test
    void testHasOldDog_False() {
        // Initialized a person with no dog
        Person person = new Person("Harsha", 25);

        assertFalse(person.hasOldDog());
    }

    @Test
    void testChangeDogsName_Success() {
        // Initialized a person with dog
        Person person = new Person("Harsha", 25, new Dog("pom", 12));

        // Expecting dog name as pom
        assertEquals("pom", person.getDog().getName() );
        person.changeDogsName("Tom");

        // Expecting dog name as Tom
        assertEquals("Tom", person.getDog().getName() );
    }

    @Test
    void testChangeDogsName_ThrowsExceptionForNoDog() {
        // Initialized a person with dog
        Person person = new Person("Harsha", 25);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> person.changeDogsName("Tom"));

        // Expecting dog name as Tom
        assertEquals("Harsha does not own a dog!", exception.getMessage() );
    }
}
