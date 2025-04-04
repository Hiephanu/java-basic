package org.example.passing_mechanism;

import java.io.PrintStream;

public class PassValue {
    public static void main(String[] args) throws CloneNotSupportedException {
        int a=0;
        changeNumber(a);
        System.out.println(a);
        StringBuilder stringBuilder = new StringBuilder("Đoàn Van");

        append(stringBuilder);
        System.out.println(stringBuilder);

        Person person = new Person(3, "Hiep");
        System.out.println(person.toString());

        changePerson(person.clone());
        System.out.println(person.toString());
        changePerson(person);
        System.out.println(person.toString());
    }
    public static void changePerson(Person person) {
        person.age = 10;
    }
    public static void append(StringBuilder s) {
        s.append("Hiep");
    }

    public static void changeNumber(int a) {
        a =10;
    }
}
