package multi_thread_creation;

public class ThreadWithRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" increases "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadWithRunnable());
		Thread t2=new Thread(new ThreadWithRunnable());
		
		t1.start();
		t2.start();
	}

}
