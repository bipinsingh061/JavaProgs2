package p1;

class A4 extends Thread{
	public  void run() {
		try {
			for(int i=0 ; i<10 ; ++i) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(250);
			}
		}
		catch(Exception e) {}
	}
}

public class ThreadSynch {
	public static void main(String args[]) {
		A4 obj=new A4();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();
		t1.setName("T1");
		t2.setName("T2");

	}
}
