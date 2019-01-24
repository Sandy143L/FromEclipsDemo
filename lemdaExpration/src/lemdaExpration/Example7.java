package lemdaExpration;
@FunctionalInterface
interface Syable{
	String say(String message);
}
public class Example7 {
	public static void main(String[] args) {
		Syable person = (message)->{
			String str1 = "i would like to say, ";
			String str2 = str1+message;
			return str2;
		};
		System.out.println(person.say("time is precious"));
	}
}
