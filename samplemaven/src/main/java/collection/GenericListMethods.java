package collection;


import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> l= new ArrayList<String>();
l.add("Red");
l.add("Green");
l.add("Blue");
System.out.println(l);
System.out.println(l.get(2));
l.set(1,"Black");
System.out.println(l);
l.add("Red");
System.out.println(l.indexOf("Red"));
System.out.println(l.lastIndexOf("Red"));
l.remove("Blue"); //l.remove(2); index number
System.out.println(l.contains("Green"));
System.out.println(l.isEmpty());
System.out.println(l.size());
	}

}

