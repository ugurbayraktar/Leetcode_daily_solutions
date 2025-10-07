import easy.singleNumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        singleNumber solver = new singleNumber();
        int[] question = {4,1,2,1,2};
        int k = 2;
        String s = "aa";
        String t  = "aaa";

        int result = solver.singleNumber(question);

        System.out.println("Sonuç: " + result);
    }
}
