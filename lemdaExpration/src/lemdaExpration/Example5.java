package lemdaExpration;
interface Adable{
	int add(int a,int b);
}
public class Example5 {
	public static void main(String[] args) {
		Adable a1 = (a,b)->(a+b);
		System.out.println(a1.add(10, 20));
		
		Adable a2 = (a,b) ->{
			return (a+b);
		};
		System.out.println(a2.add(200, 300));
	}
}
