package p1;

class Par {
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=50;
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class Child extends Par{
	void disp() {
		System.out.println("Child class");
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class Child2 {
	void disp() {
		Par obj=new Par();
		System.out.println("Child2 class independent");
		System.out.println(obj.a);
		//System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}

public class A{
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=50;
	public static void main(String arg[]) {
		/*
		// same class , private only in same class
		Par obj=new Par();
		obj.disp();
		
		//child class private doesnt work
		Child obj2=new Child();
		obj2.disp();
		*/
		
		
		Child2 obj3=new Child2();
		obj3.disp();
	}
}