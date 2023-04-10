class NonPrivateFieldAccessInSynchronizedBlock {
	
	protected List<String> statuses = new ArrayList<>(); // or public
	private Object lock = new Object();
	
	void foo() {
        // Some processing
			synchronized(lock) {
				statuses.add("Running");
				System.out.println("code issues added");
				System.out.println("code issues added");
				System.out.println("code issues added");
				System.out.println("code issues added");
				System.out.println("code issues added");
			}
		}
        // Some more processing
	}
}
