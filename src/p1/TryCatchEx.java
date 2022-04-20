package p1;

import java.io.*;

public class TryCatchEx {
	public static void main(String args[]) {
		m1();
	}
	public static void m1() {
		m2();
	}
	public static void m2() {
		m3();
	}
	public static void m3() {
		try {
			File f=new File("abc.txt");
			FileReader fr=new FileReader(f);
			System.out.println("sdsd");
		}
		catch(FileNotFoundException fcf) {
			System.out.println("file is not present in system  :)");
		}
	}
	
}
