package manu;
@FunctionalInterface
interface LambdaDemo{
	public void msg();
}
public class Lamda {
	public static void main(String[] args) {
		/*LambdaDemo l=new LambdaDemo() {
			public void msg() {
				System.out.println("HERTE");
			}
		};
		l.msg();*/
		LambdaDemo l=()->{System.out.println("fderer");};
		l.msg();
	}
}
