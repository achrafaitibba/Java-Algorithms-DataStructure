package ma.HamzaBekkaoui.ProblemSolving.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static String twoSumSortedVersionMethod(int[] listOfNumbers , int target){

        Arrays.sort(listOfNumbers);
        int start = 0;
        int end = listOfNumbers.length - 1;
        for (int i = 0; i < listOfNumbers.length; i++) {
            int result = listOfNumbers[start] + listOfNumbers[end];
            if( result == target){

                return "{ " + start + "," + end + "}";
            }
            if (result > target){
                end--;
            }
            if (result < target){
                start++;
            }
        }
        return "We did not find any combination that could be equal to the target :" + target;

    }

    public static int[] twoSumMethod(int[] listOfNumbers , int target){

        Map<Integer , Integer> valueIndexContainer = new HashMap<>();

        for (int i = 0; i < listOfNumbers.length; i++) {

            int searchingValue = target - listOfNumbers[i];
            if (valueIndexContainer.containsKey(searchingValue)) {
                return new int[]{valueIndexContainer.get(searchingValue), i};
            }
            else {
                valueIndexContainer.put(listOfNumbers[i],i);
            }

        }

        return new int[]{};

    }
}
