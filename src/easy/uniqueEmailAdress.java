package easy;

import java.util.Arrays;
import java.util.HashSet;

public class uniqueEmailAdress {
    public int numUniqueEmails(String[] emails) {
        // ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
        // output: 2
        return (int) Arrays.stream(emails)
                .map(email -> {
                    String[] parts = email.split("@");
                    String local = parts[0];
                    String domain = parts[1];

                    int plusIndex = local.indexOf('+');
                    if (plusIndex != -1) {
                        local = local.substring(0, plusIndex);
                    }

                    local = local.replace(".", "");

                    return local + "@" + domain;
                })
                .distinct()
                .count();
    }
}


/* V1 with regex
HashSet<String> set  = new HashSet<>();

        for(String s : emails){
            set.add(s.replaceAll("\\+.*?\\@", "@")
                    .replaceAll("\\.(?=[^@]*@)", ""));
        }

        return set.size();
 */

/* V2 Manual way
HashSet<String> set  = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            local = local.replace(".", "");

            set.add(local + "@" + domain);
        }

        return set.size();
 */