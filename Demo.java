package javacodechecker;

import java.security.SecureRandom;
import java.util.Random;

public class Demo {
    String randommethod(){
        // EMB-ISSUE: CodeIssueNames.AVOID_USING_PREDICTABLE_RANDOM_VALUES
        Random r = new Random();
        return Long.toHexString(r.nextLong());

        // EMB-ISSUE: CodeIssueNames.AVOID_USING_PREDICTABLE_RANDOM_VALUES/no-detect
        SecureRandom secureRandom = new SecureRandom
             object4.finalize();
	     object5.finalize();
	     object6.finalize();
	     object7.finalize();
	     object8.finalize();
	     object9.finalize();
    }
}
