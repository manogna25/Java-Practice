class Parent{//old or parent or base or super class
    int x=943;
    Parent(int as){
        System.out.println("Constr"+as);
    }
    void display(){
        System.out.println("displaying from parent");
    }
}
class Single extends Parent {//new or child or deriver or sub class
    void method(){
        System.out.println("DISPLAY");
    }
    public static void main(String[] args) {
        Single s1=new Single();
        Parent p1=new Parent(343);
        s1.method();
        s1.display();
        System.out.println(s1.x);
    }
}
