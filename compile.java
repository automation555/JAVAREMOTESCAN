public class compile{
	static final SecureRandom secureRandom = new SecureRandom();

	private static final SecureRandom secureRN = new SecureRandom();
	public int GenerateRandomValue(){
        return secureRandom.nextInt();
    }
}
