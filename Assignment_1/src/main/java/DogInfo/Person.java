package DogInfo;

import java.util.Optional;

public class Person {
    private String name;
    private int age;

    private Optional<Dog> dog;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog);
    }

    public boolean hasOldDog() {
        return this.dog != null && this.dog.isPresent() && this.dog.get().getAge() >= 10;
    }

    public void changeDogsName(String newName) {
        Optional.ofNullable(this.dog)
                .orElseThrow(() -> new RuntimeException(name + " does not own a dog!"))
                .get()
                .setName(newName);
    }

    public Dog getDog() {
        return this.dog != null && this.dog.isPresent() ? this.dog.get() : null;
    }
}
