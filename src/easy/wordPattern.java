package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        int patternLength = pattern.length();
        String[] w= s.split(" ");
        int sLenght = w.length;
        if(patternLength != sLenght) return false;

        /*
        Map<Character, String> patternMap= new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
         */
        //This one is for more clever way
        Map<Object, Integer> map = new HashMap<>();

        for(int i=0 ; i<patternLength; i ++){
            char c = pattern.charAt(i);
            String word= w[i];

            /*
            if(patternMap.containsKey(c)){
                if(!patternMap.get(c).equals(word)) return false;
            }

            if(sMap.containsKey(word)){
                if(!sMap.get(word).equals(c)) return false;
            }
            patternMap.put(c, word);
            sMap.put(word,c);
            */

            //More clever way with only one map
            if(!Objects.equals(map.putIfAbsent(c,i),map.putIfAbsent(word,i))){
                return false;
            }


        }
    return true;
    }
}
