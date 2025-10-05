package easy;

import java.util.Arrays;

public class missingNumber {

    public int missingNumber(int[] nums) {

//9,6,4,2,3,5,7,0,1
        //0,1,2,3,4,5,6,7,9
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++ ){
            int controller = nums[i];
            if(controller + 1 != nums[i+1]){
                return nums[i]+1;
            }
        }

        return  5;
    }
}
/*

int lenght = nums.length;
        int totalSum = (lenght * (lenght +1))/2;
        int realSum= 0 ;

        System.out.println(totalSum);

        for(int i=0; i<nums.length; i++){
            realSum= realSum + nums[i];
        }


        return totalSum-realSum;
 */