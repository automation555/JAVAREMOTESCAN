package javacodechecker;

public class MutableObjectShouldNotReferencePublic {
    
    public static final String[] a = {"green","yellow","red","orange","purple"};

    
    public static final String b = "This Is A String";

    
    private static final String[] c = {"Mango","Orange","apple"};
    
    public static final Integer s = 12;
    
    public static final int temp = 12;

    
    public static final Character da = "c";
    
    public static final char tem ="d";
  
  private static final String[] flower = {"rose,lotus"};
	private String[] color = {"black","green"};
	private int[] arr= {1,2,3};
	
	public String[] getColor() {
	return color;
	}
	
		public String[] getColorss() {	
		return this.color;
		}
	
	public String[] getColors() {
	return Arrays.copyOf(color);
	}
	
	public int[] getArr() {
		return arr;
	}
	
		public int[] getArrs() {
			return this.arr;
		}
	
	public int[] getArry() {
		return Arrays.copyOf(arr);
	}
	
	public String[] getFlower() {
		return flower;
	}
}
