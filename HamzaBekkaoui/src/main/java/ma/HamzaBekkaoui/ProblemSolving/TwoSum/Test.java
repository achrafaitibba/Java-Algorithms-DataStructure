package ma.HamzaBekkaoui.ProblemSolving.TwoSum;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] test = {1 , 3 , 14 , 10 , 5 , 8 };
        int[] twoSumMethodResult = TwoSum.twoSumMethod(test, 22);
        System.out.println("twoSumMethodResult :" + Arrays.toString(twoSumMethodResult));

    }

}
