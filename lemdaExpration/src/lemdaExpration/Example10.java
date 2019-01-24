package lemdaExpration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Products{
	int id;
	String name;
	float price;
	public Products(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class Example10 {
	public static void main(String[] args) {
		List<Products> list=new ArrayList<Products>();  
        list.add(new Products(1,"Samsung A5",17000f));  
        list.add(new Products(3,"Iphone 6S",65000f));  
        list.add(new Products(2,"Sony Xperia",25000f));  
        list.add(new Products(4,"Nokia Lumia",15000f));  
        list.add(new Products(5,"Redmi4 ",26000f));  
        list.add(new Products(6,"Lenevo Vibe",19000f));  
          
       Stream<Products> filtered_data = list.stream().filter(p->p.price>20000);
       
       filtered_data.forEach(
    		   products->System.out.println(products.name+": "+products.price)
    		   );
	}

}
