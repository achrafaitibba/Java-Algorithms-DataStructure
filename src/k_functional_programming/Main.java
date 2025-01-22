package k_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);
        // Using lambda expression
        // to implement Runnable
        new Thread(() -> System.out.println("New thread created")).start();
    }
}
