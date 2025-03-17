import java.util.Scanner;

public class Sarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr= new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        /*System.out.println("printing-----------------");
        for(String a:arr){
            System.out.print(a+" ");
        }*/
        int i=0;
        while(i<n){
            System.out.print(arr[i]+" ");
            i++;
        }
        
        sc.close();
    }
}
