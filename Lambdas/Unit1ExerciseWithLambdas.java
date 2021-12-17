package Lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Unit1ExerciseWithLambdas {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Enis", "Sejdini", 21),
				new Person("Luis", "Hoxha", 22),
				new Person("Enxhi", "Luis", 20),
				new Person("EnisLuis", "Enxhi", 19),
				new Person("LuisEnis", "Luizjana", 24)
				);

		//Step 1 sort a list by last name (this is done with lambdas in here)
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		Stream<Person> streamOfPeople= people.stream().sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		
		//Step 2 create a method that prints all elements in the list
		System.out.println("Exercise 2 with a simple lambda");
		printConditionally(people, p -> true);
		System.out.println();
		System.out.println("Exercise 2 with a simple lambda and streams");
		streamOfPeople.forEach(p->System.out.println(p));
		System.out.println();
		
		//Step 3 create a method that prints all people that have last name beginning with L
		System.out.println("Exercise 3 with lambdas");
		printConditionally(people, p -> p.getLastName().startsWith("L"));
		System.out.println();
		System.out.println("Exercise 3 with a lambda and streams");
		people.stream().sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
		.filter(p->p.getLastName().startsWith("L"))
		.forEach(p->System.out.println(p));
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p:people) {
			if(condition.test(p)) {
				System.out.println(p);
			}		
		}
	}
	
}
