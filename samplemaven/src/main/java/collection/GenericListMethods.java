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
//for each
List<String> i=new ArrayList<String>();
i.add("Apple");
i.add("Orange");
i.add("Grapes");
for(String s:i) //syntax: for(Type variable:Array/List name)
{
	System.out.println(s);
}
int a[]= {1,5,6,8};
for(int p:a)
{
System.out.println(p);	
}
	}

}

