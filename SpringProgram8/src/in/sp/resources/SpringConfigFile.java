package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
@Configuration
public class SpringConfigFile {
	@Bean;
	public Address createAddrOnj()
	{
		Address addr = new Address(100,"Mumbai",123445);
		
		return addr;
	}
	@Bean
	public Student createStdObj()
	{
		Student std = new Student(102,"Ajit",createAddrObj());
		
		return std;
	}

}
