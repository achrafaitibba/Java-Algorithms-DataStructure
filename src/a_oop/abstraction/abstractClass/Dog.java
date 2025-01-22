package a_oop.abstraction.abstractClass;

public final class Dog extends AbstractAnimal {
    private String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public void sound() {
        System.out.println("Haaw haaw hh");
    }
}
