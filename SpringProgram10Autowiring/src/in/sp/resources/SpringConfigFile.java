package in.sp.resources;

import java.util.List;

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
	public Subjects createStdObj()
	{
		Subjects subj = new Subjects();
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("Java");
		subjects_list.add("Python");
		subj.setSubjects(subjects_list);
		return subj;
	}
	@Bean
	public Student createStdObj()
	{
		Student std = new Student();
		
		std.setRollno(102);
		std.setName("Ajit");
		//std.setAddress(createAddrObj());
		//std.setSubjects(createSubjObj());
		return std;
	}

}
