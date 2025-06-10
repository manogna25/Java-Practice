package manu;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
public class Streamssss {
	public static void main(String[] args) {
		/*ArrayList<Integer> a= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		Stream<Integer> s=a.stream();
		Stream<Integer>	s1=s.filter(i->i%2==0);
		//s1.forEach(i->System.out.println(i));
		System.out.println("   ");
		Stream<Integer> s2=s1.map(i->i*2);
		s2.forEach(i->System.out.println(i));
		a.stream().filter(i->i%2!=0).map(j->j*2).forEach(k->System.out.println(k));*/
		ArrayList<String> a=new ArrayList<>(Arrays.asList("Siva","Manu","Lanka","Sai"));
		Stream<String> s=a.stream();
		Stream<String> s1=s.map(String::toUpperCase);
		s1.forEach(i->System.out.println(i));
	}
}
