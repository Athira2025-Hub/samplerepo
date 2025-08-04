package interefaceexample;

public class MultipleChild implements multipleparent1,multipleparent2 {
public void print()
{
	System.out.println("Child Class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChild obj= new MultipleChild();
		multipleparent1 obj1=new MultipleChild();// creates reference
		multipleparent2 obj2=new MultipleChild();// creates reference
		obj.display();
		obj.show();
		obj.print();
		obj1.display();
		obj2.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Parent 2 Class");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Parent 1 Class");

	}

}
