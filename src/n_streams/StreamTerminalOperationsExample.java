package n_streams;
import java.util.*;
import java.util.stream.Collectors;

public class StreamTerminalOperationsExample {
    public static void main(String[] args) {
        // Sample data
        List<String> names = Arrays.asList(
            "Reflection", "Collection", "Stream",
            "Structure", "Sorting", "State"
        );

        // forEach: Print each name
        System.out.println("forEach:");
        names.stream().forEach(System.out::println);

        // collect: Collect names starting with 'S' into a list
        List<String> sNames = names.stream()
                                   .filter(name -> name.startsWith("S"))
                                   .collect(Collectors.toList());
        System.out.println("\ncollect (names starting with 'S'):");
        sNames.forEach(System.out::println);

        // reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream().reduce(
            "",
            (partialString, element) -> partialString + " " + element
        );
        System.out.println("\nreduce (concatenated names):");
        System.out.println(concatenatedNames.trim());

        // count: Count the number of names
        long count = names.stream().count();
        System.out.println("\ncount:");
        System.out.println(count);

        // findFirst: Find the first name
        Optional<String> firstName = names.stream().findFirst();
        System.out.println("\nfindFirst:");
        firstName.ifPresent(System.out::println);

        // allMatch: Check if all names start with 'S'
        boolean allStartWithS = names.stream().allMatch(
            name -> name.startsWith("S")
        );
        System.out.println("\nallMatch (all start with 'S'):");
        System.out.println(allStartWithS);

        // anyMatch: Check if any name starts with 'S'
        boolean anyStartWithS = names.stream().anyMatch(
            name -> name.startsWith("S")
        );
        System.out.println("\nanyMatch (any start with 'S'):");
        System.out.println(anyStartWithS);
    }
}