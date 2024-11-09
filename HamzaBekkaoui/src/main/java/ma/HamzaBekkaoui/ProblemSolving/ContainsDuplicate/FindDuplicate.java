package ma.HamzaBekkaoui.ProblemSolving.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    public static boolean findDuplicateMethod(int[] nums){
        Set<Integer> numsWithoutDuplicate = new HashSet<>();
        for (int num : nums){
            if(numsWithoutDuplicate.contains(num))
                return true;
            numsWithoutDuplicate.add(num);
        }

        return false;
    }

}
