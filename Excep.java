public class Excep {
    public static void main(String[] args) {
        
        try{
            int n=args.length;
            System.out.println("n="+n);
            int a=45/n;
            System.out.println(a);
            int b[]={1,2,3};
            System.out.println(b[40]);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage());
        }
        finally{

            System.out.println("I am finally");
        }
    }
}
