package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	public SuperConstructorChild()
	{
		super(5,9);
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj=new SuperConstructorChild();
	}

}
