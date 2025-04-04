package org.example.staticAndNestedClass;

public class NestedClass {
    private int id;
    private static String content = "Haha";

    public int getId(int id) {
        return  id;
    }
    static class Person {
        private String name;
        private int age;

        public void printContent() {
            System.out.println(content);
        }
    }

    class InnerPerson {
        public void printId() {
            System.out.println(getId(1));
        }
    }

    public static void main(String[] args) {
        Person person  = new Person();
        NestedClass nestedClass = new NestedClass();
        NestedClass.InnerPerson innerPerson = nestedClass.new InnerPerson();
    }
}
