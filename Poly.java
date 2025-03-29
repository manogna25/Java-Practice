public class Poly {
    void add(){
        System.out.println("Nothing");
    }
    void add(String s){
        System.out.println("one "+s);
    }
    void add(float f,char c){
        System.out.println("two "+f+" "+c);
    }
    public static void main(String[] args) {
        Poly p=new Poly();
        p.add();
        p.add("Helo");
        p.add(34.2f,'r');
    }
}
