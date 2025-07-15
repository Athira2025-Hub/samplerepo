package inheritance;

public class HeirarchialChild1 extends HerirarchialParent {
	public void print()
	{
		System.out.println("Child1 Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchialChild1 obj= new HeirarchialChild1();
		obj.print();
		obj.display();
	}

}
