package Inheritance.Practice;

import Inheritance.Practice.Person;
import Inheritance.Practice.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Aashi");
        student.setEmail("aashi.gupta.in@freecharge.com");
        //IS A (Student is a person)

        Person person = new Person();
        person.setName("aashi");
        person.setEmail("aashi.gupta.in@freecharge.com");

        person.setPhoneNumber("7982-108-109");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);
    }
}
