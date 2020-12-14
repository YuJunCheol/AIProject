package di;

public class Hello {

	String greet;
	
	public String hello(String name) {
		return name + greet;
	}
	
	public void setGreet(String greet) {
		this.greet = greet;
	}
}
