package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findWordsContainsCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // "leet","code"
        // 'e'

        return IntStream.range(0, words.length)
                .filter(i -> words[i].indexOf(x) != -1)
                .boxed()
                .collect(Collectors.toList());

    }
}

/* V1
List<Integer> result = new ArrayList<>();
        for(int i=0; i< words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(words[i].charAt(j)== x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
 */