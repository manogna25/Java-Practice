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
class P4 extends P3{
    void d3(){
        System.out.println("p4");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        P2 p1=new P2();
        p1.display();
        p1.access();
        P4 p3=new P4();
        p3.d2();
        p3.d3();
    }
}
