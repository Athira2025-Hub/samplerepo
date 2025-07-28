package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		if(a>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new NumberFormatException("Age under 18!");
		}

	}

}
