class P1{
    void display(){
        System.out.println("from p1");
    }
}
class P2 extends P1{
    void access(){
        System.out.println("from p2");
    }
}
class P3 extends P1{
    void d2(){
        System.out.println("from d2");
    }
} 
class P4 extends P1{
    void a2(){
        System.out.println("from a2");
    }
}
public class Hierar {
    public static void main(String[] args) {
        P2 p1=new P2();
        p1.display();
        p1.access();
        P3 p2=new P3();
        p2.d2();
        P4 p3=new P4();
        p3.a2();
    }
}
