package easy;

import java.util.HashMap;
import java.util.Map;

public class isomorphicString {
    public boolean isIsomorphic(String s, String t) {
        //"foo","bar"
        return helper(s).equals(helper(t));
    }

    public String helper (String str){

        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
            sb.append(Integer.toString(map.get(ch)));
            sb.append("-");
        }
        return sb.toString();
    }
}
