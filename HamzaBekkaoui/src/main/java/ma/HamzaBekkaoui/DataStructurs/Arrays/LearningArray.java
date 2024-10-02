package ma.HamzaBekkaoui.DataStructurs.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class LearningArray {

    public static void main(String[] args) {

        // 1
        // Declare and initialize an array of integers with 5 elements
        int[] learning = new int[5];

        // You can also initialize an array with values
        int[] array = {2, 3, 5, 7, 11};

        // Assign values to the array
        learning[0] = 1;
        learning[1] = 2;
        learning[2] = 3;
        learning[3] = 4;
        learning[4] = 5;


        // 2
        // Access elements using their index
        System.out.println(learning[0]);

        // 3
        // update the value of the first element
        learning[0] = 111;

        // 4
        // getting the size of Array by using .length
        int sizeOfArray = learning.length;



        // 5
        // Iterate over the array
        System.out.println("Iterate over the array by using for");
        for(int i = 0 ; i < learning.length ; i++){
            System.out.println(learning[i]);
        }

        // 6
        // Iterate over the array by using foreach
        System.out.println("Iterate over the array by using foreach");
        for (int item : learning){
            System.out.println(item);
        }

        // 7
        // Fill array with default values (0 for int, null for objects)
        int[] emptyIntArray = new int[5];  // All elements will be initialized to 0

        for (int element : emptyIntArray) {
            System.out.println("Default value for Array of primitive data type : " + element);
        }

        String[] emptyStringArray = new String[5];

        for (String element : emptyStringArray){
            System.out.println("default value for Array of Object : " + element);
        }


        // 8
        // Sort an Array
        int[] unsortedArray = {10 , 6 , 100 , 66 , 9 , 1 , 2};
        Arrays.sort(unsortedArray);
        System.out.println("sorted Array : " + Arrays.toString(unsortedArray));
        // Arrays.toString(array)
        // we use Arrays.ToString() to print array values


        //  9
        //  Search for an Element in an Array
        int[] arrayToSearchForAnElement = {10 , 6 , 100 , 66 , 9 , 1 , 2};
        int indexOfTheSearchElement = Arrays.binarySearch(arrayToSearchForAnElement, 66);
        System.out.println("the index of the searched element : " + indexOfTheSearchElement);


        // 10
        // Copy an Array
        int[] originalArray = {10 , 6 , 100 , 66 , 9 , 1 , 2};
        // Using Arrays.copyOf(originArray , LengthOfNewArray);
        int[] copiedArrayByUsingCopyOf = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Origin Array : " + Arrays.toString(originalArray));
        System.out.println("Copy Array : " + Arrays.toString(copiedArrayByUsingCopyOf));

        // Using a for Loop
        int[] copiedArrayByUsingForLoop = new int[originalArray.length];
        for (int i = 0 ; i < originalArray.length ; i++){
            copiedArrayByUsingForLoop[i] = originalArray[i];
        }

        System.out.println("Origin Array : " + Arrays.toString(originalArray));
        System.out.println("Copy Array : " + Arrays.toString(copiedArrayByUsingForLoop));


        // Using clone() Method
        int[] clonedArray = originalArray.clone();

        System.out.println("Origin Array : " + Arrays.toString(originalArray));
        System.out.println("Copy Array : " + Arrays.toString(clonedArray));


        // Using Streams
        int[] copiedArrayByUsingStreams = IntStream.of(originalArray).toArray();
        System.out.println("Origin Array : " + Arrays.toString(originalArray));
        System.out.println("Copy Array : " + Arrays.toString(copiedArrayByUsingStreams));


        // Array of Objects
        String[] arrayOfObjects = new String[3];
        arrayOfObjects[0] = "object n1";
        arrayOfObjects[1] = "object n2";
        arrayOfObjects[2] = "object n3";
        System.out.println("print array of objects :" + Arrays.toString(arrayOfObjects));

    }

}
