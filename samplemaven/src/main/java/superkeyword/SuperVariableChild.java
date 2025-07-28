package superkeyword;

public class SuperVariableChild extends SuperVariableParent{
	String color="Blue";
	public void display()
	{
		System.out.println(super.color);
		System.out.println(color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj=new SuperVariableChild();
		obj.display();
	}

}
