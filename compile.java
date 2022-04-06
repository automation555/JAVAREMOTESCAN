public class compile{
	static final SecureRandom secureRandom = new SecureRandom();

	 static final SecureRandom secureRN = new SecureRandom();
	public int GenerateRandomValue(){
        return secureRandom.nextInt();
    }
}
