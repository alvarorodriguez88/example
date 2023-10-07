package principal;

import secundario.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Carlitos");
        person1.setDni("45179121Z");
        System.out.println(person1.getDni());
        System.out.println(person1.getName());
    }
}