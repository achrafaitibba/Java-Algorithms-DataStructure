package a_oop.abstraction.abstractClass;

abstract class Cat extends AbstractAnimal {

    public Cat(String name, String breed, String eyeColor){
        super(name);
    }

    abstract void run();
//    String getColor() {
//        return color;
//    }
//    void setColor(String color) {
//        this.color = color;
//    }
//
//    @Override
//    void sound() {
//        System.out.println("Meaw Meow.. hh");
//    }
}
