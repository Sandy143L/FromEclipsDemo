package lemdaExpration;
interface Sayble{
	public String say(int x);
}
public class Example2 {
	public static void main(String[] args) {
	Sayble s=(int x)->{
		return "I have No word to say you "+ x;
	};
	System.out.println(s.say(5));
	}
}
