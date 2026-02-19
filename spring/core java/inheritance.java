
public class inheritance {
    public static void main(String[] args) {
        home a= new home();
        a.display();
        a.show(); 
    }
}
class house{
 int a=10;
     public void display(){
        System.out.println("hello");
     }
}
class home extends house{
 public void show(){
    System.out.println("welcome");
 }
}
    

