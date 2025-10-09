import easy.ransomNote;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ransomNote solver = new ransomNote();
        int[] question = {4,1,2,1,2};
        int k = 2;
        String s = "aa";
        String t  = "aab";

        boolean result = solver.canConstruct(s,t);

        System.out.println("Sonuç: " + result);
    }
}
