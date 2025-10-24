package easy;

import java.net.UnixDomainSocketAddress;

public class detectCapital {
    public boolean detectCapitalUse(String word) {

        return word.equals(word.toUpperCase())  ||
                word.equals(word.toLowerCase()) ||
                word.equals(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());

    }
}

/* V1

        for(int i = 1 ; i<word.length(); i ++){
            char c = word.charAt(i);

            if(Character.isUpperCase(word.charAt(0))){
                if(Character.isUpperCase(word.charAt(1))){
                    if(!Character.isUpperCase(word.charAt(i))) return false;
                }else{
                    if(!Character.isLowerCase(word.charAt(i))) return false;
                }

            }else{
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }

            }
        }
        return true;
 */