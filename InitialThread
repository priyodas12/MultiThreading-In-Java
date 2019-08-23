package multi_thread_creation;

public class InitialThread  extends Thread{
	
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
		// TODO Auto-generated method stub
		
		InitialThread i1=new InitialThread();
		InitialThread i2=new InitialThread();
		i1.start();
		i2.start();

	}
}
