package in.com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumber {
public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<Integer>();
	
	list.add(72);
	list.add(64);
	list.add(3);
	list.add(4);
	list.add(50);
	
	System.out.println(list);
	
	List<Integer> evenlist = new ArrayList<Integer>();
	
	for(Integer i: list) {
		if(i%2==0) {
			evenlist.add(i);
		}
	}
	System.out.println(list);
	System.out.println(evenlist);
	
//	for even numbers
//	Stream<Integer> stream = list.stream();
//	List<Integer> numlist = stream.filter(i ->i%2==0).collect(Collectors.toList());
	
	//System.out.println(numlist);
	
	Stream<Integer> stream = list.stream();
	List<Integer> newlist = stream.filter(e ->e >50).collect(Collectors.toList());
	
	System.out.println(newlist);
	
	
}
}
