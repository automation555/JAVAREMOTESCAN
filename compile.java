public class compile{
	static final SecureRandom secureRandom = new SecureRandom();

	 static final SecureRandom secureRN = new SecureRandom();
	 int GenerateRandomValue(){
        return secureRandom.nextInt();
    }
}
