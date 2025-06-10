package manu;

public interface DemoInter {
	default void msg(){
        System.out.println("this is default");
        m();
    }
    private void m(){
        System.out.println("this is private");
    }
}

