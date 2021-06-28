package training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CollectionnFetch {
	
	private static List<Person> personList = Arrays.asList(new Person("Vidya"),new Person("Pallavi"),new Person("Ravali"));
	public static void main(String[] args) {
	
		System.out.println("----using Iterator-----");
		Iterator<Person> c=personList.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next().name);
		}
		
		System.out.println("--using foreach--");
		for(Person s:personList)
		{
			System.out.println(s.name);
		}
		System.out.println("-----List Iterator------");
		ListIterator<Person> d= personList.listIterator();
		while(d.hasNext())
		{
			System.out.println(d.next().name);
		}
		
		System.out.println("--java8--");
		personList.stream().map(s->s.name).forEach(System.out::println);
		
		System.out.println("Reverse Order printing");
		System.out.println("-----List Iterator------");
		ListIterator<Person> eh= personList.listIterator(personList.size());
		while(eh.hasPrevious())
		{
			System.out.println(eh.previous().name);
		}
		
		System.out.println("--java8--");
		List<Person> persons=personList; 
		 Collections.reverse(persons);
	   persons.stream().map(s->s.name).forEach(System.out::println);
	}

}

class Person
{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
}