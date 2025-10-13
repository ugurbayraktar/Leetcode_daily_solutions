package easy;

import java.util.*;

public class richestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        // accounts   {{1,5},{7,3},{3,5}}
        return Arrays.stream(accounts)
                .mapToInt(customer -> Arrays.stream(customer).sum())
                .max()
                .orElse(0);
    }
}


/* V1
List<Integer> list = new ArrayList<>();
        int counter=0;
        for(int i = 0 ; i< accounts.length; i ++ ){
            for(int j = 0 ; j< accounts[i].length; j++){
                counter = counter + accounts[i][j];
                System.out.println("Here + " + counter);
            }
            list.add(counter);
            counter = 0;
        }
        int maxSet = Collections.max(list);
        return maxSet;
 */

/* V2
int wealth=0;
        for(int i=0 ; i< accounts.length; i ++){
            int sum= 0 ;
            for(int j=0; j< accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum> wealth) wealth= sum;
        }
         return wealth;
 */