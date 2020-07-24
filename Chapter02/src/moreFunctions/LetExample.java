package moreFunctions;

public class LetExample {
    public static void main(String args[]) {
        new LetExample().letExample();
    }

    private void letExample() {
        Person person = null;
        if (person != null) {
            System.out.println(person.getAge() * 2);
        }

        person = new Person("Maanya", 5, "London");
        if (person != null) {
            System.out.println(person.getAge() * 2);
        }
    }
}
