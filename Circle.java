import java.util.Scanner;

public class Circle {
    float r;
    void area(float a){
        r=a;
        double carea=(Math.PI*r*r);
        System.out.println(carea);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        Circle c1=new Circle();
        c1.area(n);
        sc.close();
    }
}
