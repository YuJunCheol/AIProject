package di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import student.StudentDAO;
import student.StudentService;

@Configuration
@ComponentScan(basePackages = {"student"})
public class AppContextStudent {

//	@Bean
//	@Qualifier("test")
//	public StudentDAO studentDao1() {
//		return new StudentDAO();
//	}
//	
//	@Bean
//	public StudentDAO studentDao2() {
//		return new StudentDAO();
//	}
	
	@Bean
	public StudentService studentService() {
		return new StudentService();
	}
}
