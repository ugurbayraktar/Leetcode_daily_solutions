package easy;

import java.util.Arrays;

public class maxProductionOfTwoElement {
    public int maxProduct(int[] nums) {
        // 3,4,5,2
        // (nums[i]-1)*(nums[j]-1)

        int max1 = 0, max2 =0;

        for(int n : nums){
            if(n > max1){
                max2 = max1;
                max1 = n;
            }else if(n> max2){
                max2 = n;
            }
        }

        int result = (max1 - 1) * (max2 - 1);

        return result;
    }
}

/* V1 Brute force
Arrays.sort(nums);
        int length = nums.length -1;
        int result = (nums[length] - 1) * (nums[length-1] -1);

        return result;
 */