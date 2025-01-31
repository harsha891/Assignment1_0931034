package DogInfoTest;

import DogInfo.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDog {

    Dog dog_1;

    @BeforeEach
    void initiateDog() {
        dog_1 = new Dog("Tuck", 10);
    }

    @Test
    void testDogNameGetterSetter() {
        // Asserting initial dog name
        assertEquals("Tuck", dog_1.getName());

        dog_1.setName("Muck");

        // Asserting dog name after setName() is invoked
        assertEquals("Muck", dog_1.getName());
    }

    @Test
    void testDogAgeGetterSetter() {
        // Asserting initial dog name
        assertEquals(10, dog_1.getAge());

        dog_1.setAge(11);

        // Asserting dog name after setName() is invoked
        assertEquals(11, dog_1.getAge());
    }
}
