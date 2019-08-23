package multi_thread_creation;

public class Sychronized_App {
	
	private volatile int  count=0;
	
	public synchronized void  increment() {
		count++;
	}
	
	public static void main(String[] args) {
		Sychronized_App sa=new Sychronized_App();
		sa.doSynchronizedWork();

	}

	public void doSynchronizedWork() {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					increment();
				}
				
			}
		});
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					increment();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count Value "+count);
		
	}

}
