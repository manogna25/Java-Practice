import java.util.Scanner;

public class Farm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(z%x==0 && z%y==0){
            System.out.println("Any");
        }
        else if((z%x==0) && (z%y!=0) ){
            System.out.println("CHICKEN");
        }
        else if((z%y==0) && (z%x!=0)){
            System.out.println("DUCK");
        }
        else{
            System.out.println("NONE");
        }
    }
}
