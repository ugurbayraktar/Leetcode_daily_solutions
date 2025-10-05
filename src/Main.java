import easy.findTheDifference;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        findTheDifference solver = new findTheDifference();
        int[] question = {9,6,4,2,3,5,7,0,1};
        int k = 2;
        String s = "aaabbc";
        String t  = "ababce";

        char result = solver.findTheDifference(s,t);

        System.out.println("Sonuç: " + result);
    }
}

// {a=2, b=1, c=1}

// aaa

// aaaa

// {a,b,c,e}
// {a,b,c}