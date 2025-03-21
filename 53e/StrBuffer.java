public class StrBuffer {
    public static void main(String[] args) {
        /*StringBuffer sb=new StringBuffer("Hello");
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
        System.out.println(s);*/
        StringBuffer sb=new StringBuffer("Hello world");
        sb.insert(7,"is");
        System.out.println(sb);
        StringBuffer s=new StringBuffer("I am a programmer");
        s.reverse();
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.replace(7,17,"developer");
        System.out.println(s);
        s.delete(5, 7);
        System.out.println(s);
    }
}
