package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotion.AnnotationConfigApplicationContext;

import in.sp.beans.Student;

public class Main 
{	
	public static void main(String[] args)
	{)
		ApplicationContext context new AnnotationConfigapplicationContext(SpringConfigFile.class);
		
		Student std=(Student)context.getBean("StdId1");
		std.display();
	}

}
