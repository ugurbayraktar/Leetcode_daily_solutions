import easy.containsDuplicateII;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        containsDuplicateII solver = new containsDuplicateII();
        int[] question = {1,2,3,1,2,3};
        int k = 3;


        boolean result = solver.containsNearbyDuplicate(question,k);

        System.out.println("Sonuç: " + result);
    }
}
