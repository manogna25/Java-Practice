public class Elif {
    public static void main(String[] args) {
        int p=47;
        if(p>=75 && p<=90){
            System.out.println("First class distinction");
        }
        else if(p>=60){
            System.out.println("First class");
        }
        else if(p>=50){
            System.out.println("second class");
        }
        else if(p>=30){
            System.out.println("third class");
        }
        else{
            System.out.println("fail");
        }
    }
}
