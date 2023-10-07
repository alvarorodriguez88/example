package principal;

import secundario.Job;
import secundario.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Carlitos");
        person1.setDni("45179121Z");
        System.out.println(person1.getDni());
        System.out.println(person1.getName());
        Job job1 = new Job();
        job1.setDayhours(6);
        job1.setSalary(1500);
        System.out.println("El salario es de " + job1.getSalary() + " euros y trabaja " + job1.getDayhours() + " horas diarias.");
    }
}