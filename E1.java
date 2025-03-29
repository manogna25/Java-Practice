interface E2{
    int min=5;
    void add();
}
interface E3 {
    void display();
    
}
class w1{
    void access(){
        System.out.println("Accesss");
    }
}

class E1 extends w1 implements E2,E3{
    public void add(){
        System.out.println("HIIIIIIIIIII");
    }
    public void display(){
        System.out.println("HELLOOOOOOOO!!!!!!!!!!!!!!");
    }
    public static void main(String[] args) {
        E1 e=new E1();
        e.add();
        e.display();
        e.access();
        System.out.println(min);
    }
}
