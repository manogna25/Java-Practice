public class StrBuilde {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        //append()
        sb.append("World");
        System.out.println(sb);
        //insert
        sb.insert(5," ");
        System.out.println(sb);
        int n=sb.length();
        System.out.println(n);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0,5);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.setCharAt(0,'H');
        System.out.println(sb);
        sb.replace(0,5,"Hello");
        System.out.println(sb);
        System.out.println(sb.capacity());
        String s=sb.toString();
        System.out.println(s);
        
    }
}
