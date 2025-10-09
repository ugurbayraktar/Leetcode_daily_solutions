package easy;

import java.util.HashMap;

public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        //aa  and ab
        HashMap<Character,Integer> mapRansom = new HashMap<>();
        HashMap<Character,Integer> mapMagazine = new HashMap<>();

        for(int i = 0 ; i<ransomNote.length(); i ++){
            char c = ransomNote.charAt(i);
            mapRansom.put(c, mapRansom.getOrDefault(c, 0) + 1);
        }

        for(int i = 0 ; i<magazine.length(); i ++){
            char c = magazine.charAt(i);
            mapMagazine.put(c, mapMagazine.getOrDefault(c, 0) + 1);
        }
        for (char c : mapRansom.keySet()) {
            if (mapMagazine.getOrDefault(c, 0) < mapRansom.get(c)) {
                return false;
            }
        }
        return true;
    }
}
