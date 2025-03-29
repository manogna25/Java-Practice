class Parent{
    Parent(int a){ 
        System.out.println("default constructorss"+a);
    }
    int x=123;
}
public class Super extends Parent{
    Super(){
        super(20);
        System.out.println("CHILD");
    }
    int x=6;
    void display(){
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        Super s=new Super();
        s.display();
        
    }
}
