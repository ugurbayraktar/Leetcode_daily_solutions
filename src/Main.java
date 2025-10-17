import easy.countNumberofConsStrings;

import java.util.Arrays;
//In order to use the solution, please change the related class to wished one and edit the entry parameter according to that question.
// You may find more than one solution for some questions. These are several tries and different techniques.

public class Main {
    public static void main(String[] args) {
        countNumberofConsStrings solver = new countNumberofConsStrings();
        //Example entry parameters
        int[] question = {4000,3000,1000,2000};
        int[][] questionDoubleArray = {{1,2,3},{3,2,1}};
        int low = 234;
        int heigh = 716760;
        double d = 36.50;
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        String s = "Leetcode, daily. streak- achieved";
        String t  = "ab";


        timer.measure(() -> { //Timer function to follow process time.

            int result = solver.countConsistentStrings(t, words); //Careful about the return type.
            System.out.println("Sonuç: " + result);

        });
    }
}

