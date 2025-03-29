class Parent1{
    void display(){
        System.out.println("method from parent");
    }
}
public class RPoly extends Parent1{
    void display(){
        super.display();
        System.out.println("child class method");
    }
    public static void main(String[] args) {
        RPoly rp=new RPoly();
        rp.display();
        
    }
}
