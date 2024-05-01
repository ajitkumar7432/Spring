package in.sp.beans;

public class Student 
{
	
	private int rollno;
	private String name;
	@Autowired
	private Address address;
	@Autowired
	private Subjects subjects;
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
		System.out.println("Subjects : "+subjects)
	}

	public Subjects getSubjects() {
		return subjects;
	}

	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
}
