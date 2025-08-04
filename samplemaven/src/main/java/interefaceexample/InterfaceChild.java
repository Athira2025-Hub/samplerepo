package interefaceexample;

public class InterfaceChild implements InterfaceParent {
	public void print()
	{
		System.out.println("print");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj=new InterfaceChild();//object creation
		InterfaceParent obj1= new InterfaceChild();//reference creation
		obj.display();
		obj.show();
		obj.print();
		obj1.display();
		obj1.show();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceChild");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
	System.out.println("Show");	
	}

}
