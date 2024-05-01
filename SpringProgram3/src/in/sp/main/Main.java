package in.sp.main;

import in.sp.beans.Student;

public class Main {
 public static void main(String[] args)
	{
	 String resouce_file_pth="/in/sp/resources/applicationContext.xml";
	 ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
	 
	 Student std=(Student) context.getBean("student");
	 std.display();
	}
}
