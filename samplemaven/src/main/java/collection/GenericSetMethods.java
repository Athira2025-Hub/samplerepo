package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> s= new HashSet<String> ();
s.add("Apple");
s.add("Grapes");
System.out.println(s);
Set<String> s1=new HashSet<String>();
s1.add("Banana");
s1.add("Orange");
System.out.println(s1);
s.addAll(s1);
System.out.println(s);
System.out.println(s.contains("Orange"));
System.out.println(s.containsAll(s1));
System.out.println(s.isEmpty());
s1.remove("Orange");
System.out.println(s1);
s.removeAll(s1);
System.out.println(s);
System.out.println(s.size());
System.out.println(s1.size());
s1.clear();
System.out.println(s1);
	}

}
