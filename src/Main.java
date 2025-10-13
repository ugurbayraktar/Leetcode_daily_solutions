import easy.substractTheProductSum;

import java.util.Arrays;
//In order to use the solution, please change the related class to wished one and edit the entry parameter according to that question.
// You may find more than one solution for some questions. These are several tries and different techniques.

public class Main {
    public static void main(String[] args) {
        substractTheProductSum solver = new substractTheProductSum();
        //Example entry parameters
        int[] question = {-4,-1,0,3,10};
        int[][] questionDoubleArray = {{1,2,3},{3,2,1}};
        int low = 537;
        int heigh = 716760;
        double d = 36.50;
        String s = "Leetcode, daily. streak- achieved";
        String t  = "aaa";


        timer.measure(() -> {

            int result = solver.subtractProductAndSum(low); //Careful about the return type.
            System.out.println("Sonuç: " + result);

        });
    }
}

