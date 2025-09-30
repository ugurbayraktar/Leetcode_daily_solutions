import easy.majorityElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        majorityElements solver = new majorityElements();
        int[] question = {3,3,4};


        int result = solver.majorityElement(question);

        System.out.println("Sonuç: " + result);
    }
}
