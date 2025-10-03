package easy;

import java.util.HashMap;

public class containsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> controller = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(controller.containsKey(nums[i])){
                int previousKey = controller.get(nums[i]);
                if(i - previousKey <= k){
                    return true;
                }
            }
            controller.put(nums[i], i );
        }

        return false;
    }
}
