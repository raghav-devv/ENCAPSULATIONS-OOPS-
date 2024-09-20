package org.example;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(20);
        person.setName("Ram");

        System.out.println("Age of the person is:"+person.getAge());
        System.out.println("Name of the Person is :"+person.getName());
    }
}