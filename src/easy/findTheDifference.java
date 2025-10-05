package easy;

import java.util.HashMap;
import java.util.HashSet;

public class findTheDifference {
    public char findTheDifference(String s, String t) {

        char charS;
        char charT;
        HashMap<Character,Integer> hashMapS = new HashMap<>();
        HashMap<Character,Integer> hashMapT = new HashMap<>();

        for(char c : s.toCharArray()){
            if(hashMapS.containsKey(c)){
                hashMapS.put(c, hashMapS.get(c) + 1);
            }else{
                hashMapS.put(c,1);
            }
        }
        // aa
        // aaa

        for(char c : t.toCharArray()){
            if(hashMapS.containsKey(c)){
                hashMapT.put(c, hashMapT.get(c) + 1);
            }else{
                hashMapT.put(c,1);
            }
        }
        System.out.println(hashMapT);
        System.out.println(hashMapS);





        return 't';
    }
}
