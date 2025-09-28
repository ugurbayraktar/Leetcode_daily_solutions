import easy.plusOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        plusOne solver = new plusOne();
        int[] question = {9,9,9};


        int[] result = solver.plusOneSolution(question);

        System.out.println("Sonuç: " + Arrays.toString(result));
    }
}
