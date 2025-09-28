package easy;

public class plusOne {
    public int[] plusOneSolution(int[] digits) {

        /*
        int result = 0;
        for(int i = 0; i<digits.length;i++){
            int element = digits[i];
            result = result*10 +element;
        }
        result = result+1;
        String s1 = Integer.toString(result);
        int[] numbers = new int[s1.length()];
        for(int i=0; i<numbers.length; i++){
            numbers[i]=s1.charAt(i)- '0';
        }
        return numbers; */

        //optimized solution

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // digit was 9, so becomes 0 and carry goes to next
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

    }
}
