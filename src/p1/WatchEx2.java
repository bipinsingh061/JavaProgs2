package p1;

import java.io.IOException;

public class WatchEx2  {
	public static void main(String args[]) throws IOException, InterruptedException   {
		
		int secs=0 ;
		int h=0;
		int m=0;
		int times=0;
		for(int s=0 ; s<=1000 ; ++s,++times) {
			if(times==100)
				break;
			if(s==60) {
				++m ;
				s=0;
			}
			if(m==60) {
				++h;
				m=0;
			}
			String toPrint=Integer.toString(s);
			System.out.print(toPrint);
			for (int i = 0; i < toPrint.toString().length(); i++) {
                System.out.print((char) 8);
            }
			Thread.sleep(1000);
		}


	}
}
