package p1;

class A3 extends Thread {
	public void run() {
		try {
			for(int i=1 ; i<=10 ; ++i ) {
				System.out.println("I  : "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			
		}
	}
}

class B3 extends Thread{
	public void run() {
		try {
			for(int j=1 ; j<=10 ; ++j ) {
				System.out.println("	J  : "+j);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			
		}
	}
}
public class ThreadEx {

	public static void main(String args[]) {
		A3 ao=new A3();
		B3 bo=new B3();
		ao.start();
		bo.start();
		
	}
}
