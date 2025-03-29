class Final1{
    void display(){
        System.out.println("display from parent");
    }
}
class Sample extends Final1{
    void display(){
        System.out.println("from child");
    }
    public static void main(String[] args) {
        Sample s1=new Sample();
        s1.display();
    }
}

