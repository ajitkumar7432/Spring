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
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("Mumbai");
		addr.setPincode(123445);
		
		return addr;
	}
	@Bean
	public Student createStdObj()
	{
		Student std = new Student();
		
		std.setRollno(102);
		std.setName("Ajit");
		//std.setAddress(createAddrObj());
		return std;
	}

}
