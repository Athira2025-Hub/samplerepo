package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
public void print()
{
	super.display();
	System.out.println("Print");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj=new SuperMethodChild();
		obj.print();
	
	}

}
