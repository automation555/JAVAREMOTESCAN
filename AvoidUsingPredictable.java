package javacodechecker;

import java.security.SecureRandom;
import java.util.Random;

public class AvoidUsingPredictable {
    String randommethod(){
        // EMB-ISSUE: CodeIssueNames.AVOID_USING_PREDICTABLE_RANDOM_VALUES
        Random r = new Random();
        return Long.toHexString(r.nextLong());
        System.out.println("added new issue");

        // EMB-ISSUE: CodeIssueNames.AVOID_USING_PREDICTABLE_RANDOM_VALUES/no-detect
        SecureRandom secureRandom = new SecureRandom();
    }
}
