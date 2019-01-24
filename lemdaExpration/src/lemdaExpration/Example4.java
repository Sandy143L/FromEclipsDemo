package lemdaExpration;
interface Addable{
	public int add(int a,int b);
}
public class Example4 {

	public static void main(String[] args) {
		Addable ad = (a,b)->(a+b);
		System.out.println("the sums of 10 and 20 is = "+ad.add(10, 30));

	}

}
