package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainWithXml {

	public static void main(String[] args) {
		// 설정파일(xml) 읽어오기
		ApplicationContext ctx = new ClassPathXmlApplicationContext("di/context.xml");
		// 빈객체 가져오기
		Test t1 = (Test)ctx.getBean("test");
		Test t2 = ctx.getBean("test", Test.class);
		Test t3 = ctx.getBean(Test.class);
		t1.test();
		t2.test();
		t3.test();
		System.out.println(t1 == t2 && t2 == t3);
	}

}
