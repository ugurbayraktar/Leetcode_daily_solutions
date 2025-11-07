package medium;

import java.util.*;

public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        // {"eat","tea","tan","ate","nat","bat"}

        Map<String, List<String>>  map = new HashMap<>();

        for(String word: strs){
            char[] characters = word.toCharArray();
            Arrays.sort(characters);
            String sortedWord = new String(characters);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);

        }

        return new ArrayList<>(map.values());



    }
}

