package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 설정파일(AppContext.class)을 불러오기
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		// 빈(객체) 가져오기
		// 매개변수 (빈이름, 타입)
		Hello h = ctx.getBean("hello2", Hello.class);
		System.out.println(h.hello("홍길동"));
		
		
		Hello h2 = ctx.getBean("hello", Hello.class);
		System.out.println(h2.hello("홍길동"));
		System.out.println(h == h2); // 싱글톤이므로 같은 객체
		// 종료(빈 소멸)
		//ctx.close();
	}

}
