package p2;
import p1.*;

class Indep{
	
	void disp() {
		A obj=new A();
		System.out.println(obj.a);
//		System.out.println(obj.b);
//		System.out.println(obj.c);
//		System.out.println(obj.d);
	}
}

class InhClass extends A{
	void disp() {
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
	}
}

public class Par2 {
	public static void main(String args[]) {
//		Indep obj=new Indep();
//		obj.disp();
		InhClass obj2=new InhClass();
		obj2.disp();
	}
}
