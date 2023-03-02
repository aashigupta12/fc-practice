package Inheritance.Exercise;

public class Person {
    private String name;
    private String phoneNumber;
    private String email;

    public Person(String name) {
        System.out.println("person constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
//        return getClass().getName() + "#" + Integer.toHexString(hashCode());
        return name + " # " + email + " # " + phoneNumber;
    }
}
