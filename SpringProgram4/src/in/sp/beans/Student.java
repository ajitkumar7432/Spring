package in.sp.beans;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Ajit");
	private String name;
	@Vlaue("101");
	private int roll no;
	@Value("97.75f")
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
public void display() {
	System.out.println("Name : "+name);
	System.out.ptintln("Rollno :"+rollno);
	System.out.println("Marks "+marks)
}


}
