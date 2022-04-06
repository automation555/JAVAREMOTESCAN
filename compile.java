public class compile{
	static final SecureRandom secureRandom = new SecureRandom();

	 int GenerateRandomValue(){
        return secureRandom.nextInt();
    }
}
