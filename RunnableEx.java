
public class RunnableEx implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableEx re=new RunnableEx();
		Thread t=new Thread(re);
		Thread t2=new Thread(re);
		t.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("I am runnable implementation"+Thread.currentThread());
	}

}
