package Inheritance_Demo.src;

public class SuperAndSuperConstructorDemo {

    static class Person {
        protected String name;

        // Parent constructor initializes the name.
        public Person(String name) {
            this.name = name;
            System.out.println("Person constructor called.");
        }

        public void showRole() {
            System.out.println(name + " is a general person.");
        }
    }

    static class Teacher extends Person {
        private String subject;

        // super() calls the parent constructor.
        public Teacher(String name, String subject) {
            super(name);
            this.subject = subject;
            System.out.println("Teacher constructor called.");
        }

        // Overriding the parent method.
        @Override
        public void showRole() {
            // super calls the parent version of the method.
            super.showRole();
            System.out.println(name + " teaches " + subject + ".");
        }
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Nimal", "Mathematics");
        teacher.showRole();
    }
}
