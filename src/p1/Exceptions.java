package p1;

import java.io.*;
import java.sql.*;

class A2{
	void abc() throws FileNotFoundException,SQLException {
		for(int i=1 ; i<=20 ; ++i) {
			System.out.println(i);
			if(i==5) throw new NullPointerException();
			if(i==4) throw new ArrayIndexOutOfBoundsException();
			if(i==3) throw new FileNotFoundException();
			if(i==2) throw new SQLException();
		}
	}
}

public class Exceptions {
	public static void main(String args[]) {
		try {
			A2 obj=new A2();
			obj.abc();
		}
		catch(NullPointerException npe) {
			System.out.println("NullPointerException came ");
		}
		catch(ArrayIndexOutOfBoundsException npe) {
			System.out.println("ArrayIndexOutOfBoundsException came ");
		}
		catch(FileNotFoundException fe) {
			System.out.println("FileNotFoundException came ");
		}
		catch(SQLException fe) {
			System.out.println("SQLException came ");
		}
		catch(Exception e) {
			
		}
	}
}
