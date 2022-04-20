package p1;

class A5 extends Thread{
	public  void run() {
		try {
			for(int i=0 ; i<=50 ; ++i) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {}
	}
}

public class ThreadMethod {
	public static void main(String args[]) {
		
				A5 obj=new A5();
				Thread t1=new Thread(obj);
				Thread t2=new Thread(obj);
				t1.start();
				t2.start();
				t1.setName("T1");
				t2.setName("T2");
				for(int k=0 ; k<=30 ; ++k) {
					try {
						if(k==5)
							t1.suspend();
						if(k==10)
							t1.resume();
						if(k==15)
							System.out.println(t1.isAlive());
						if(k==20)
							t1.stop();
						if(k==25)
							System.out.println(t1.isAlive());
						System.out.println("K : "+k);
						Thread.sleep(1000);
					}
					catch(Exception e) {}
				}
	

		}

	}

