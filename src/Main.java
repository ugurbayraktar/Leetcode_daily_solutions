import easy.generateTagForVideoCaption;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        generateTagForVideoCaption solver = new generateTagForVideoCaption();
        int[] question = {9,6,4,2,3,5,7,0,1};
        int k = 2;
        String s = "Leetcode, daily. streak- achieved";
        String t  = "aaa";

        String result = solver.generateTag(s);

        System.out.println("Sonuç: " + result);
    }
}

// {a=2, b=1, c=1}

// aaa

// aaaa

// {a,b,c,e}
// {a,b,c}