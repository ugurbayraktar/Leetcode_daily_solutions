package easy;

import java.util.HashMap;
import java.util.HashSet;

public class findTheDifference {
    public char findTheDifference(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(char c : t.toCharArray()){
            if(map.getOrDefault(c,0) == 0){
                return c;
            }else map.put(c, map.get(c) -1 );
        }

        return ' ';
    }
}
