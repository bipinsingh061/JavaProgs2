package p1;

import java.util.*;

public class HashMapEx {
	public static void main(String args[]) {
	
		HashMap al=new HashMap();
		al.put(1, "sds");
		al.put("saf","haha");
		al.put('s',"lala");
		al.put(666,"fafa");
		
		Set set = al.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
				

//		System.out.println(al);
		
	}
}
