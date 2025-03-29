abstract class Animal{
    abstract void makeSound();
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("BARKK");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("MEOW");
    }
}
public class Abs {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
    }
}
