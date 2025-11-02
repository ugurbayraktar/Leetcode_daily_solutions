package easy;

import java.util.stream.IntStream;

public class runningSumOf1DArray {
    public int[] runningSum(int[] nums) {

        int[] result= new int[1];

        int[] runningSum = IntStream.of(nums)
                .map(n -> result[0]+=n)
                .toArray();

        return runningSum;
    }
}

/*V1
 int counter=0;
        int[] result= new int[nums.length];

        for(int i =0; i< nums.length; i++){
            counter = counter + nums[i];
            result[i]= counter;
        }
*/
