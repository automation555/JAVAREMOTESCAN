package javacodechecker;

public class ExplicitCallToFinalize {
    public void methodCall(){

        // EMB-ISSUE: CodeIssueNames.EXPLICIT_CALL_TO_FINALIZE
        object1.finalize();

        // EMB-ISSUE: CodeIssueNames.EXPLICIT_CALL_TO_FINALIZE/no-detect
        object2 = null;
	object2.finalize();
        // EMB-ISSUE: CodeIssueNames.EXPLICIT_CALL_TO_FINALIZE/no-detect
        object1.methodCall();


	 object3.finalize();
	     object4.finalize();
	     object5.finalize();
	     object6.finalize();
	     object7.finalize();
	     object8.finalize();
	     object9.finalize();
	    System.out.println("Hello");
	    System.out.println("Hello");
	    System.out.println("Hello");
	    System.out.println("Hello");
	    System.out.println("Hello");
	     System.out.println("Hello");
	    System.out.println("Hello");
	    System.out.println("Hello");
	    System.out.println("Hello");
	    System.out.println("Hello");
	     System.out.println("Hello");
	    System.out.println("Hello");
	    System.out.println("Hello");
	    System.out.println("Hello");
	    System.out.println("Hello");
    }
}
