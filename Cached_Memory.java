package multi_thread_creation;

import java.util.Date;
import java.util.Scanner;

class Processor extends Thread{
	private volatile boolean flag=true;
	public void run() {
		while(flag) {
			System.out.println(new Date());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void terminate() {
		flag=false;
	}
}

public class Cached_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Processor p1=new Processor();
		p1.start();
		System.out.println("Press Return To Stop");
		Scanner scn=new Scanner(System.in);
		scn.nextLine();
		p1.terminate();
		

	}

}
