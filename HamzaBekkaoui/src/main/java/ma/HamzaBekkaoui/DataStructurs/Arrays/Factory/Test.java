package ma.HamzaBekkaoui.DataStructurs.Arrays.Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//
//        int[] test = new int[2];
//        test[0] = 1;
//        test[1] = 11;
//
//        int[] clone = test;
//        clone[0] = 100;
//        System.out.println(Arrays.toString(test));
//        System.out.println(Arrays.toString(clone));

        MyArray<String> names = new MyArray<>();
        names.add("Hamza");
        names.add("khalid");
        names.add("aziz");
        names.add("amina");

        for (String name : names){
            System.out.println(name);
        }

        System.out.println("index of hamza :" + names.indexOf("Hamza"));
        System.out.println("get the element in the index 3 :" + names.get(3));

        names.update(0 , "hamza");
        names.update(1 , "khalid");
        names.remove("aziz");

        for (String name : names){
            System.out.println(name);
        }

        System.out.println("does names have , hamza :" + names.contains("hamza"));



        System.out.println("dynamic array section :");
        MyDynamicArray<String> dynamicArray = new MyDynamicArray<>(2);
        System.out.println("dynamic array size :" + dynamicArray.size());
        dynamicArray.add("ff");
        dynamicArray.add("aa");
        dynamicArray.add("ss");
        dynamicArray.add("bb");
        dynamicArray.remove("ff");
        System.out.println("dynamic array after resizing it from 2 to 10 :");
        for (String item : dynamicArray){
            System.out.println(item);
        }
        System.out.println("dynamic array size :" + dynamicArray.size());

    }

}
