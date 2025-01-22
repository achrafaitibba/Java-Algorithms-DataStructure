package a_oop.abstraction.abstractClass;

abstract class AbstractAnimal {

    /**
     * Option-1 : using protected to allow inheritance access within same package,
     * (encapsulation from outside classes) but allowing access to any subclass
     * also not need for encapsulating with getter/setter.
     * Option-2 : Could have used private with protected getter/setter...
     */
    protected String name;
    AbstractAnimal(String name) {
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
    void eat(){
        System.out.println("Eating...");
    }

    abstract void sound();

}
