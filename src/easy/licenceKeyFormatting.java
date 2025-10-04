package easy;

public class licenceKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {

        String[] arrayOfString = s.split("-");
        String joinedString = String.join("", arrayOfString);
        int modAsResult = joinedString.length() % k;
        int start = 0;

        StringBuilder sb = new StringBuilder();
        if(modAsResult != 0){
            sb.append(joinedString, 0, modAsResult);
            start = modAsResult;
        }

        for (int i = start; i<joinedString.length(); i += k){
            if(sb.length()>0) sb.append("-");
            sb.append(joinedString, i , Math.min(i+k, joinedString.length()));
        }



    return sb.toString().toUpperCase();
    }
}
