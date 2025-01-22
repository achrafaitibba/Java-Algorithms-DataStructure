package e_anonymous_class_object;

class Main {
    String att;

    public Main(String att) {
        this.att = att;
    }

    void test(){
        System.out.println("Hello World");
    }


    interface ToImplement{
        void hello(String name);
    }


    public static void main(String[] args) {
        //Anonymous object -> extend use case of anonymous class (extending Main class)
        new Main("Test"){
            @Override
            void test() {
                System.out.println("Hello World from anonymous object");
            }
        }.test();

        //Could also be done with implementing interfaces directly when creating instance
        ToImplement impl = new ToImplement() {
            @Override
            public void hello(String name) {
                System.out.println("Hello " + name);
            }
        };
        impl.hello("Achraf");


    }
}
