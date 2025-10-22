package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class intersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toSet());

        return Arrays.stream(nums1)
                .filter(set2::contains)
                .distinct()
                .toArray();
    }
}

/* V1
HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i=0; i< nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i=0; i< nums2.length; i++){
            set2.add(nums2[i]);
        }

        set1.retainAll(set2);
        int[] result = new int[(set1.size())];
        int i = 0;
        for (int n : set1) {
            result[i++] = n;
        }
 */