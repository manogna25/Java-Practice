public class Nest {
    public static void main(String[] args) {
        int a=10,b=29,c=2;
        if(a>b){
            if(a>c){
                System.out.println("a is big");
            }
            else{
                System.out.println("c is big");
            }
        }
        else{
            if(b>c){
                System.out.println("b is big");
            }
            else{
                System.out.println("c is big");
            }
        }
    }
}
