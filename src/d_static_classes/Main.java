package d_static_classes;

import d_static_classes.OuterClass.StaticNested;

import d_static_classes.OuterClass.InnerClass;

class Main {
    public static void main(String[] args) {
        StaticNested staticNested = new StaticNested();
        staticNested.printAge();

        InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.display();

    }
}
