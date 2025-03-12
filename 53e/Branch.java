public class Branch {
    static int solve(){
        int l=10,b=3;
        int res=l*b;
        return res;
    }
    static int par(int l,int b){
        int res=l*b;
        return res;
    }
    public static void main(String[] args) {
        /*for(int i=0;i<10;i++){
            if(i==5)
                break;
            System.out.println(i);
        }*/
        /*for(int i=1;i<=10;i++){
            if(i%2==0)
                continue;
            System.out.println(i);
        }*/
        int res=solve();
        System.out.println(res);
        int rs=par(10,5);
        System.out.println(rs);
    }
}
