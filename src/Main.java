import easy.countNegativeInSortedMatrix;

import java.util.Arrays;
//In order to use the solution, please change the related class to wished one and edit the entry parameter according to that question.
// You may find more than one solution for some questions. These are several tries and different techniques.

public class Main {
    public static void main(String[] args) {
        countNegativeInSortedMatrix solver = new countNegativeInSortedMatrix();
        //Example entry parameters
        int[] question = {1,2,2,1};
        int[] question2 = {2,2};
        int[][] questionDoubleArray = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int low = 234;
        int heigh = 716760;
        double d = 36.50;
        String[] words = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String s = "sAa";
        String t  = "ab";


        timer.measure(() -> { //Timer function to follow process time.

            int result = solver.countNegatives(questionDoubleArray); //Careful about the return type.
            System.out.println("Sonuç: " + result);

        });
    }
}

