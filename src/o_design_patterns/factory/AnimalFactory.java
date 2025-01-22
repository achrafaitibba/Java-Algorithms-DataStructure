package o_design_patterns.factory;

class AnimalFactory {

    public static Animal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        else if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        }
        return null;
    }
}
