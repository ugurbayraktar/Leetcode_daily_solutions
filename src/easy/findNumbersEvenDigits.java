package easy;

import java.util.Arrays;

public class findNumbersEvenDigits {
    public int findNumbers(int[] nums) {

        //nums 12,345,2,6,7896
        //555,901,482,1771
        return (int) Arrays.stream(nums)
                .filter(num -> ((int) Math.log10(num) + 1) % 2 == 0) //.filter(num ->String.valueOf(num).length()%2 == 0)
                .count();

    }
}


/*
 int counter=0;
        for(int i = 0 ; i< nums.length; i++){
            if(String.valueOf(nums[i]).length() % 2 == 0) counter ++;
            //System.out.println(String.valueOf(nums[i]).length());
        }
        return counter;

 */