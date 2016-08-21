ublic class ThreadEx extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx te=new ThreadEx();
		
		te.start();
		te.setName("Payilagam");
		te.setPriority(1);
	
		
		ThreadEx  te2=new ThreadEx();
		
		te2.start();
		te2.setName("siva");
		te2.setPriority(3);
		try {
			te2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End the class");
	}
	
	 public  void run()
	{
	
		value();
	}
	 
	 
	synchronized  void value()
	 {

			if(Thread.currentThread().getName().equals("Payilagam"))
			{
				System.out.println(" satisfied thread"+Thread.currentThread());
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			synchronized (this) {
				System.out.println(" I am running"+Thread.currentThread());
			}
			
	 }
