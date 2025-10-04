import easy.licenceKeyFormatting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        licenceKeyFormatting solver = new licenceKeyFormatting();
        int[] question = {9,6,4,2,3,5,7,0,1};
        int k = 2;
        String s = "2-5g-3-J";
        String t  = "nagaram";

        String result = solver.licenseKeyFormatting(s, k);

        System.out.println("Sonuç: " + result);
    }
}
