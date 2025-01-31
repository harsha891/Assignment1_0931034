package DogInfo;

public class Main {
    public static void main(String arg[]) {
        Person person = new Person("Harsha", 25);

        try {
            person.changeDogsName("tom");
        } catch (Exception e) {
            System.out.println("Unable to change dogs name : " + e.getMessage());
        }
    }
}
