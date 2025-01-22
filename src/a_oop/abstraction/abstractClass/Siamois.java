package a_oop.abstraction.abstractClass;

public class Siamois extends Cat {

    String originCountry;
    public Siamois(String name, String breed, String eyeColor, String originCountry) {
        super(name, breed, eyeColor);
        this.originCountry = originCountry;
    }


    @Override
    void run() {
        System.out.println("Siamois running");
    }

    @Override
    void sound() {
        System.out.println("Siamois meaw meaw meaw meaw meaw....");
    }
}
