package ma.HamzaBekkaoui.Algorithms.BinarySearch;

public class Main {

    public static void main(String[] args) {
        int[] test = {1 , 3 , 5 , 10 , 20 , 22 , 26};

        int search = BinarySearch.search(test, 261);
        System.out.println("result of binary search is : " + search);
    }

}
