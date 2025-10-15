package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        //  1,2,3,2
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .mapToInt(Map.Entry::getKey)
                .sum();
    }
}

/* Brute force

HashMap<Integer , Integer> map = new HashMap<>();
        int sum=0;

        for(int number : nums){
            map.put(number, map.getOrDefault(number,0) + 1);
        }

        for(int element : map.keySet()){
            if(map.get(element) == 1){
                sum =element + sum;
            }
        }


        return sum;

 */