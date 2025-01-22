package a_oop.polymorphism.object_reference;

public class Main {


    public static void main(String[] args) {

        Person person = new Person(); //Person reference and object
        Person another_person = new Teacher(); //Person reference, Teacher object
        Teacher teacher = new Teacher(); //Teacher reference and obj.
        person.teach();//output: Person can teach
        // Here you can see Teacher object's method is executed even-
        // -though the Person reference was used
        another_person.teach();//output: Teacher can teach in a school
        teacher.teach();//output: Teacher can teach in a school

        // result
        /**
         * Person can teach
         * Teacher can teach in a school
         * Teacher can teach in a school
         *
         * Note:
         * This also applies the Liskov Substitution Principle,
         * which states that objects of a superclass
         * should be replaceable with objects of a subclass
         * without affecting the correctness of the program.
         */

        // result if teached doesn't override teach method
        /**
         * Person can teach
         * Person can teach
         * Person can teach
         * */
    }

}
