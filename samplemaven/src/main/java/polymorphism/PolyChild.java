package polymorphism;

public class PolyChild extends PolyParent {
public void display(int a, int b)
{
	super.display(9,5);
	int c= a-b;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyChild obj=new PolyChild();
		obj.display(8,3);
	}

}
