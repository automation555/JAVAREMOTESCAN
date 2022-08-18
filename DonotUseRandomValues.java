package javacodechecker;

import java.security.SecureRandom;


public class DonotUseRandomValues {
    String randommethod(){
       
        SecureRandom secureRandom = new SecureRandom();
    }
}
