import easy.isomorphicString;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        isomorphicString solver = new isomorphicString();
        int[] question = {10,-5,-3,0,5,8,9};


        boolean result = solver.isIsomorphic("foo","bar");

        System.out.println("Sonuç: " + result);
    }
}
