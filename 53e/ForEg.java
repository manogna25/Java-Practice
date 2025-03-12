public class ForEg {
    public static void main(String[] args) {
        int n=10;
        /*for(int i=0;i<=n;i++){
            System.out.print(i+" ");
            
        }
        for(int i=n;i>=0;i--){
            System.out.print(i+" ");
        }
        System.out.println("OUT");
        */
        /*for(int i=n;i>=0;i--){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();*/
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
            System.out.println(f);
        }
        
    }
}
