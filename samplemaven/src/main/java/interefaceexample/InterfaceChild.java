package interefaceexample;

public class InterfaceChild implements InterfaceParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj=new InterfaceChild();
		obj.display();
		obj.show();
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
