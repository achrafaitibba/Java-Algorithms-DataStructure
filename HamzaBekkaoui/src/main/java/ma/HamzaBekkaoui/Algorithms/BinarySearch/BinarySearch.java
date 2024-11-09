package ma.HamzaBekkaoui.Algorithms.BinarySearch;


public class BinarySearch {

    public static int search(int[] array , int target){
        int count = 0;
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            count++;
            int middle = (start + end) / 2;
            if(array[middle] == target){
                System.out.println("we iterate throw this loop for " + count + " times to find the answer .");
                return  middle;
            }
            if(array[middle] <= target){
                System.out.println("start has the value " + start);
                start = middle + 1;
                System.out.println("start has changed to the value " + start);
            }

            if(array[middle] >= target){
                System.out.println("end has the value " + end);
                end = middle - 1;
                System.out.println("end has changed to the value " + end);
            }
        }
        System.out.println("we iterate throw this loop for " + count + " times to without finding the answer .");
        return -1;
    }

}
