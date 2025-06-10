package manu;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.BiPredicate;

import java.util.*;
public class Consu {
	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<>(Arrays.asList(1,2,3,4,5));
		a.forEach(i->System.out.println(i));
		Consumer<ArrayList<Integer>> c= (ArrayList<Integer> ar)->{System.out.println(ar.get(0)+ar.get(1));};
		c.accept(a); 
		Predicate<Integer> b= (Integer i)->i%2==0;
		boolean result=b.test(20);
		System.out.println(result);
		Function<Integer,Integer> f=(Integer i)->{return i*2;};
		System.out.println(f.apply(3));
		BiPredicate<Integer,Integer> j=(Integer w,Integer e)->w==e;
		boolean r=j.test(1, 1);
		System.out.println(r);
	}
}
