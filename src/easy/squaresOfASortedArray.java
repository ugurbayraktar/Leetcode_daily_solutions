package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class squaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        int length = nums.length;
        int left= 0;
        int right = length-1;
        int[] solution= new int[length];

        for(int i = right; i>= 0; i--){
            if(Math.abs(nums[left]) >Math.abs(nums[right])){
               solution[i]= nums[left] * nums[left];
               left++;
            }else{
               solution[i]= nums[right] * nums[right];
                right--;
            }


        }


        return solution;
    }
}


/* V1
int[] outcome = new int[nums.length];
        for(int i=0 ; i< nums.length; i++){
            outcome[i]= nums[i]*nums[i];
        }
        Arrays.sort(outcome);
        return outcome;
 */

/*V2 with stream
return Arrays.stream(nums)
                .map(n-> n*n)
                .sorted()
                .toArray();
 */