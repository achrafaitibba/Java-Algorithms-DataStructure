package f_sealed_class.after;


sealed class Service permits Car, Truck {
    void test(){
        System.out.println("test");
    }
}