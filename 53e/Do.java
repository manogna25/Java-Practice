public class Do {
    static void solve(){
        int n=10,i=1;
        do{
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }while(i<=n);
    }
    public static void main(String[] args) {
        solve();
    }
}
