package easy;

import java.util.HashSet;
import java.util.Set;

public class countNumberofConsStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        /*
        String[] words = {"a","b","c","ab","ac","bc","abc"}
        String t  = "ab"
         */

        Set<Character> allowedSet = new HashSet<>();
        for(char c: allowed.toCharArray()){
            allowedSet.add(c);
        }
        System.out.println(allowedSet);

        int count = 0;

        for(String word: words){
            boolean isContains= true;

            for(Character c: word.toCharArray()){
                if(!allowedSet.contains(c)){
                    isContains = false;
                    break;
                }
            }
            if(isContains) count++;

        }



        return count;
    }
}
