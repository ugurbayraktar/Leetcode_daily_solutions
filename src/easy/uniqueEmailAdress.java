package easy;

import java.util.HashSet;

public class uniqueEmailAdress {
    public int numUniqueEmails(String[] emails) {
        // ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
        // output: 2

        HashSet<String> set  = new HashSet<>();

        for(String s : emails){
            set.add(s.replaceAll("\\+.*?\\@", "@")
                    .replaceAll("\\.(?=[^@]*@)", ""));
        }

        return set.size();
    }
}
