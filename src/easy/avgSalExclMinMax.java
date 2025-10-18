package easy;

import java.util.Arrays;

public class avgSalExclMinMax {

    public double average(int[] salary) {

        //4000,3000,1000,2000

        int length = salary.length-2;
        Arrays.sort(salary);
        double sum=0;

        for(int i = 1; i< length +1; i++){
            sum = sum + salary[i];
        }
        double result = sum/ length;

        return result;
    }
}
