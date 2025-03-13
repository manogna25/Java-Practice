import java.util.Scanner;
class Pattern2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        /*
            * * * *
            *     *
            *     *
            * * * *
         */
        /*for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==(n/2)||j==(n/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
        
    }
}