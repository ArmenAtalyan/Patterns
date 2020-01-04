package builder2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Zakyan 1")
                .buildAAge(34)
                .buildName("Vachik Zakaryanc")
                .build();
        person.print();
    }
}
