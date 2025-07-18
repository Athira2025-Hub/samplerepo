package abstraction;

public class AbstractChild extends AbstractParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.show();
	}

	@Override
	public void display() {
		System.out.println("Abstract Child");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		int a=5;
		int b=8;
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
