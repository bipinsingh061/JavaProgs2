package p1;

class A1{
	private int Id ;
	private String Name ;
	
	void setId(int Id) {
		this.Id=Id;
	}
	void setName(String Name) {
		this.Name=Name;
	}
	int getId() {
		return Id;
	}
	String getName() {
		return Name;
	}
}
public class SetGetEx {
	public static void main(String args[]) {
		A1 obj=new A1();
		obj.setId(100);
		obj.setName("bipin");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}
}
