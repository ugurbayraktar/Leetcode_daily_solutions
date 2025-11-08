package medium;

import java.sql.Array;
import java.util.*;

public class topKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        // [1,1,1,2,2,3], k = 2
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) +1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            heap.offer(entry);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] result = new int[k];
        for(int i=0; i<k ; i++){
            result[i] = heap.poll().getKey();
        }


        return result;
    }
}
