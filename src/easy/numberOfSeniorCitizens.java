package easy;

import java.util.Arrays;

public class numberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        // "7868190130M7522","5303914400F9211","9273338290F4010"
        // How many bigger than 60
        int count=0;

        for(String info: details){
            int ageTens = info.charAt(11) - '0';
            int ageOnes = info.charAt(12) - '0';

            int age = ageTens * 10 + ageOnes;
            if(age > 60 ) count++;
        }
        return count;
    }
}


//int age = Integer.parseInt(n.substring(11, 13));

/*V1
int counter=0;
        for(String n : details){
            int age = Integer.parseInt(n.charAt(11) + "" + n.charAt(12));
            if( age > 60 ){
                counter ++;
            }
        }
        return counter;
 */
/*Stream
 int count = (int) Arrays.stream(details)
                .filter(s -> Integer.parseInt(s.substring(11, 13)) > 60)
                .count();

        return count;
 */