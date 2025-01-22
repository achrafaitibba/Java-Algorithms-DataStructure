package d_static_classes;

class OuterClass {
    private static int age = 10;

    //Nested class not static ==> Inner Class
    class InnerClass{
        void display(){
            System.out.println("Age from Inner non-static class: " + age);
        }
    }

    // Could be static
    static class StaticNested{
        void printAge(){
            // if age non-static -> compile error
            System.out.println("Age from Inner static class: " + age);
        }
    }
}
