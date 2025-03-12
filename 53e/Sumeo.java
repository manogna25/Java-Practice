public class Sumeo {
    public static void main(String[] args) {
        int n=1234234,sume=0,sumo=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                sume+=rem;
            }
            else{
                sumo+=rem;
            }
            n=n/10;
        }
        System.out.println("sum of even:"+sume);
        System.out.println("sum of odd:"+sumo);
    }
}
