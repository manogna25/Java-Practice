class Student{
    
    private String name;
    private int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
}
public class Encap {
    
    public static void main(String[] args) {
        Student s=new Student("Siva",20);
        System.out.println(s.getname()+" "+s.getage());
        s.setname("Manu");
        System.out.println(s.getname());
    }
}
