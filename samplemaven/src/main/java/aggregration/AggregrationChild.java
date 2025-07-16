package aggregration;

public class AggregrationChild {
	String city;
	String state;
	AggregrationParent ref;
	public AggregrationChild(String city, String state, AggregrationParent ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display()
	{
	System.out.println(ref.name+" "+ref.rollno+" "+ref.address);
	System.out.println(city+" "+state);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregrationParent obj=new AggregrationParent("Athira",20, "Address");
		AggregrationChild obj1= new AggregrationChild("TVM","Kerala",obj);
		obj1.display();
	}

}
