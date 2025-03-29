class Parent{
    int x=943;
    void display(){
        System.out.println("displaying from parent");
    }
}
class Derived extends Parent{
    void d2(){
        System.out.println("from d2");
    }
    
}
class P3 extends Derived {
    void method(){
        System.out.println("DISPLAY");
    }
}
class MultiLevel{
    public static void main(String[] args) {
        P3 p=new P3();
        p.display();
        p.d2();
        p.method();
        System.out.println(p.x);
    }
}
