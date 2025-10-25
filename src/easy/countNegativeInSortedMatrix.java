package easy;

public class countNegativeInSortedMatrix {
    public int countNegatives(int[][] grid) {

        int counter=0;

        for(int[] row : grid){
            for(int value: row){
                if(value<0) counter++;
            }
        }

        return counter;
    }
}
