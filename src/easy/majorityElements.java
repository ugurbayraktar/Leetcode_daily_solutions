package easy;

import java.util.HashMap;
import java.util.Map;

public class majorityElements {
    public int majorityElement(int[] nums) {
        /*
        int halfOfNums = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i ++){
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count +1 );
            map.get(nums[i]);
            if(map.get(nums[i]) > halfOfNums) return nums[i];
        }
        return 1;
         */
        int candidate=0;
        int count = 0;
        for(int num : nums){
            if(count == 0) candidate = num;
            if(num == candidate) count++;
            else count--;
        }
        return candidate;
    }
}
