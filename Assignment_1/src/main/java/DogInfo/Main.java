package DogInfo;

public class Main {
    public static void main(String arg[]) {
        // Creating a person with no dog
        Person person = new Person("Harsha", 25);

        try {
            // trying to changing the dog name of person
            person.changeDogsName("tom");
        } catch (Exception e) {
            System.out.println("Unable to change dogs name : " + e.getMessage());
        }
    }
}
