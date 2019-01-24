package lemdaExpration;
interface Sayable {
	public String say(String name);
}
public class Example3 {
	public static void main(String[] args) {
		Sayable s =(name)->{
			return "hello: "+name;
		};
		System.out.println(s.say("sandeep"));
	}
}
