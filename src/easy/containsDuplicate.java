package easy;

import java.util.HashSet;

public class containsDuplicate {
    public boolean containsDuplicateSolution(int[] nums) {

        HashSet<Integer> controller = new HashSet<>();

        for(int number : nums){
            if(controller.contains(number)){
                return true;
            }
            controller.add(number);
        }
    return false;
    }


}
