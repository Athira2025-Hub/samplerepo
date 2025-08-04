package abstraction;

public class AbstractChild extends AbstractParent{
	
	public void print()
	{
		System.out.println("print");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj=new AbstractChild();//object creation
		AbstractParent obj1= new AbstractChild();//reference creation
		obj1.display();
		obj1.show();
		obj.display();
		obj.show();
		obj.print();
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
