package Lambdas;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Enis", "Sejdini", 21),
				new Person("Luis", "Hoxha", 22),
				new Person("Enxhi", "Luis", 20),
				new Person("EnisLuis", "Enxhi", 19),
				new Person("LuisEnis", "Luizjana", 24)
				);

		//Step 1 sort a list by last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		
		//Step 2 create a method that prints all elements in the list
		System.out.println("Exercise 2 with first way");
		printAll(people);
		System.out.println();
		
		//Step 3 create a method that prints all people that have last name beginning with L
		System.out.println("Exercise 3 with first way");
		printAllWhoseLastNameBeginsWithL(people);
		System.out.println();
		
		System.out.println("Exercise 3 with second way");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("L");
			}
			
		});
		System.out.println();
		
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p:people) {
			if(condition.test(p)) {
				System.out.println(p);
			}		
		}
	}

	private static void printAllWhoseLastNameBeginsWithL(List<Person> people) {
		for (Person p:people) {
			if(p.getLastName().startsWith("L")) {
				System.out.println(p);
			}		
		}
		
	}

	private static void printAll(List<Person> people) {
		for (Person p:people) {
			System.out.println(p);
		}
		
	}

}


