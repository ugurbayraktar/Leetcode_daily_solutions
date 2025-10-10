package easy;

import java.util.HashMap;

public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] counts = new int[26];

        for(char c : magazine.toCharArray()){
            counts[c - 'a']++;
        }

        for(char c : ransomNote.toCharArray()){
            counts[c - 'a']--;
            if(counts[c- 'a']< 0)
            {
                return false;
            }
        }

        return true;
    }
}


 /*
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
        */