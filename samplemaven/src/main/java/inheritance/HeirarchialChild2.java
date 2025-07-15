package inheritance;

public class HeirarchialChild2 extends HerirarchialParent{
	public static void print1()
	{
		System.out.println("Child2 Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchialChild2 obj= new HeirarchialChild2();
		obj.print1();
		obj.display();
	}

}
