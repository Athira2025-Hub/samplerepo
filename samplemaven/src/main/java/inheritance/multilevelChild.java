package inheritance;

public class multilevelChild extends multilevelParent {
public void print1()
{
	System.out.println("Child class");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
multilevelChild obj=new multilevelChild();
obj.display();
obj.print();
obj.print1();
	}

}
