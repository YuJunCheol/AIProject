package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import student.StudentService;
import student.StudentVO;

public class MainStudent {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContextStudent.class);
		StudentService service = ctx.getBean(StudentService.class);
		
		StudentVO vo = new StudentVO();
		vo.setStudno(9501151);
		vo.setId("leejunhee");
		
		int r = service.insert(vo);
		System.out.println(r);
		
	}

}
