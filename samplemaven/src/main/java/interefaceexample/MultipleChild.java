package interefaceexample;

public class MultipleChild implements multipleparent1,multipleparent2 {
public void print()
{
	System.out.println("Child Class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChild obj= new MultipleChild();
		obj.display();
		obj.show();
		obj.print();
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
