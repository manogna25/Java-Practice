import java.util.Arrays;

public class EgString {
    public static void main(String[] args) {
        /*String s="hello";
        System.out.println(s);
        String s1;
        s1="hiii";
        System.out.println(s1);
        String s2=new String("Welcome");
        System.out.println(s2);
        System.out.println(s.length());
        char ch=s.charAt(2);
        System.out.println(ch);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s1.compareTo(s1));
        System.out.println(s1.startsWith("h"));
        System.out.println(s2.endsWith("e"));
        System.out.println(s2.replace("e", "r"));
        String a="Welcomee";
        System.out.println(a.substring(1));
        System.out.println(a.substring(1,3));
        String s4=a.substring(2);
        System.out.println(s4);
        String q="     manu      ";
        System.out.println(q);
        System.out.println(q.trim());
        System.out.println(s1.indexOf("i"));
        System.out.println(s1.lastIndexOf("i"));
        String j="Welcome to the class";
        String[] j1=j.split(" ");
        System.out.println(Arrays.toString(j1));
        System.out.println(j.contains("to"));
        System.out.println(j.isEmpty());
        String k="hello world!world!world";
        System.out.println(k.replaceAll("world", "java"));
        String g="Welcome";
        for(int i=0;i<g.length();i++){
            System.out.print(g.charAt(i));
        }
        System.out.println();
        */
        String a="Himalays";
        String b="are beautiful.";
        String c=" ";
        String d="";
        d=d.concat(a);
        d=d.concat(c);
        d=d.concat(b);
        System.out.println(d);
        Scanner sc=new Scanner(System.in);
        //Replace character
        /*String str=sc.next();
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        String str1="";
        //String str2=str.replace(c1,c2);
        //System.out.println(str2);
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c1){
                str1=str1+c2;
            }
            else{
                str1=str1+str.charAt(i);
            }
        }
        System.out.println(str1);*/
        //remove character
        /*String str=sc.next();
        String s="";
        char ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                continue;
            }
            else{
                s=s+str.charAt(i);
            }
        }
        System.out.println(s);*/
        //remove spaces in between 
        /*String str=sc.nextLine();
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }
            else{
                s=s+str.charAt(i);
            }
        }
        System.out.println(s);*/
        //string sentence reverse
        /*String str=sc.nextLine();
        String s[]=str.split(" ");
        String s1="";
        for(int i=s.length-1;i>=0;i--){
            s1=s1+s[i]+" ";
        }
        System.out.println(s1.trim());*/
        //i am good ==> I Am Good
        /*String str=sc.nextLine();
        String s[]=str.split(" ");
        String s1="";
        for(int i=0;i<s.length;i++){
            //s[i]=s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase();
            s[i]=Character.toUpperCase(s[i].charAt(0))+s[i].substring(1).toLowerCase();
        }
        for(int i=0;i<s.length;i++){
            s1=s1+s[i]+" ";
        }
        System.out.println(s1.trim());
        */
        //palindrome
        /*String str=sc.next();
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        if(s.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }*/
        /*String str=sc.next();
        boolean b=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                b=false;
                break;
            }
        }
        if(b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }*/
        //score of a string
        /*String str=sc.next();
        int score=0;
        for(int i=0;i<str.length()-1;i++){
            score+=Math.abs((int)(str.charAt(i))-(int)(str.charAt(i+1)));
        }
        System.out.println("score of string \""+str+"\" is "+score);
        */
        /*String str=sc.next();
        char c1='.';
        String c2="[.]";
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c1){
                s+=c2;
            }
            else{
                s+=str.charAt(i);
            }
        }
        System.out.println(s);*/
        /*int n=sc.nextInt();
        int x=0;
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(String a:arr){
            if(a.equals("X--")||a.equals("--X")){
                x=x-1;
            }
            if(a.equals("X++")||a.equals("++X")){
                x=x+1;
            }
        }
        System.out.println(x);*/
        /*int n=sc.nextInt();
        int count=0;
        while(n!=0){
            count++;
            if(n%2==0){
                n/=2;
            }
            else{
                n-=1;
            }
        }
        System.out.println("No of steps: "+count);*/
    }
}
