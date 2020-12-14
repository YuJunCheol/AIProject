package di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppContext {

	@Bean
	//@Scope("prototype")
	public Hello hello() {
		// 빈을 등록하기위한 메서드
		Hello h = new Hello();
		h.setGreet("님 안녕하세요");
		return h;
	}
	
	@Bean
	public Hello hello2() {
		// 빈을 등록하기위한 메서드
		Hello h = new Hello();
		h.setGreet("야 안녕");
		return h;
	}
}
