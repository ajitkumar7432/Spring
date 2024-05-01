package in.sp.resources;

import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public Student stdId1()
	{	
		Student std - new Student();
		std.setName("Ajit"));
		std.getRollno(101);
		std.setEmail("ajit@gmail.com");
		
		return std;
	}
}
