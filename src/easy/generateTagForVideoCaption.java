package easy;

public class generateTagForVideoCaption {
    public String generateTag(String caption) {
    // "Leetcode daily streak achieved"
        // "#leetcodeDailyStreakAchieved"

        String[] words = caption.toLowerCase().trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        sb.append("#");

        for(int i = 0 ; i< words.length; i++){
            String word = words[i];

            if(word.isEmpty()) continue;

            if(i  == 0 ) {
                sb.append(word);
            }else{
                sb.append(Character.toUpperCase(word.charAt(0)));
                if(word.length()>1){
                    sb.append(word.substring(1).toLowerCase());
                }
            }

        }
        String result = sb.toString().replaceAll("[^a-zA-Z#]", "");
        if(result.length()> 100){
            result = result.substring(0,100);
        }

        return result;
    }
}
