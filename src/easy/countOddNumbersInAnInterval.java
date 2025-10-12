package easy;

import java.util.stream.Stream;

public class countOddNumbersInAnInterval {
    public int countOdds(int low, int high) {

        /* Solution with mathematical approach
        return ((high - low) / 2) + ((low % 2 != 0 || high % 2 != 0) ? 1 : 0); */

        return Stream.of(low,high)
                .mapToInt(n -> n%2)
                .sum() > 0 ? (high - low) / 2 + 1 : (high - low) / 2 ;

    }
}
