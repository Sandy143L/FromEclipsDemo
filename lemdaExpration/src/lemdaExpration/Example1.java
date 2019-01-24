package lemdaExpration;
interface Drawable{  
    public void draw();  
}  
public class Example1 {  
    public static void main(String[] args) {  
        int width=10;  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  
    }  
}  