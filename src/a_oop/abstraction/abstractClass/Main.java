package a_oop.abstraction.abstractClass;

class Main{

    public static void main(String[] args) {
        AbstractAnimal abstractAnimal = new AbstractAnimal("Animal-name") {
            @Override
            void sound() {
                System.out.println("default animal sound");
            }
        };
        abstractAnimal.sound();
        System.out.println(abstractAnimal.name);


        Dog dog = new Dog("Max", "German");
        dog.eat();
        System.out.println(dog.name);
        System.out.println(dog.getBreed());

    }
}
