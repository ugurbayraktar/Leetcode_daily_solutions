package easy;

public class subtractTheProductSum {
    public int subtractProductAndSum(int n) {
        // n = 234

        String digits= String.valueOf(n);

        int sum = digits.chars()
                        .map(c -> c - '0')
                        .sum();

        int product = digits.chars()
                        .map(d -> d - '0')
                                .reduce(1, (a,b)-> a*b);

        return product-sum;
    }
}


/* Best and most efficient way

int sum=0;
        int multiplication=1;
        while(n>0){
            int digit = n%10;
            sum= sum + digit;
            multiplication= multiplication*digit;
            n = n/10;
        }
        int result = multiplication - sum;

        return result;

 */