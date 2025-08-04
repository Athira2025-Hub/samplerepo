package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericlistMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List S= new ArrayList();
		S.add("Red");
		S.add("Green");
		S.add("Blue");
		System.out.println(S);
		System.out.println(S.get(2));
		S.set(1,"Black");
		System.out.println(S);
		S.add("Red");
		System.out.println(S.indexOf("Red"));
		System.out.println(S.lastIndexOf("Red"));
		S.remove("Blue"); //l.remove(2); index number
		System.out.println(S.contains("Green"));
		System.out.println(S.isEmpty());
		System.out.println(S.size());
		
	}

}
