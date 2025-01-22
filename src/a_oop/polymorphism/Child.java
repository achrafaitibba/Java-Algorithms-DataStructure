package a_oop.polymorphism;

public class Child extends Parent {

    @Override
    public void talk() {
        System.out.println("Child talk");
    }

    //Overloading
    public void walk(){
        System.out.println("Child walk");
    }
    public void walk(boolean alone){
        if(alone)
            System.out.println("Child is walking alone");
        else
            System.out.println("Child is walking with company");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.talk();
    }
}
