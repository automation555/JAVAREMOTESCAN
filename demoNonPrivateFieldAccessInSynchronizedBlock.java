class demoNonPrivateFieldAccessInSynchronizedBlock {
	
	protected List<String> statuses = new ArrayList<>(); // or public
	private Object lock = new Object();
	
	public void foo() {
        // Some processing
			synchronized(lock) {
				statuses.add("Running");
			}
		}
     protected void finalize() 
{

}   // Some more processing
	}

