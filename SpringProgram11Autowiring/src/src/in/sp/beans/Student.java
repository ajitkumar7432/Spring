package in.sp.beans;

public class Student 
{
	@Autowired
	@Qualifier("createAddrObj1");
	private int rollno;
	private String name;
	private Address address;

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void display() {
		System.out.println("Roll no: "+rollno);
		System.out.println("Name :"+name);
		System.out.println("Address"+address);
	}
}
