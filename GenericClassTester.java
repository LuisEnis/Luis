package advancedJava;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GenericClassTester {

	public static void main(String[] args) {
		GenericClass<String, String> strings = new GenericClass<>("My name is Luis and I am the best.", "Never forget that name.");
		GenericClass<Integer, Integer> integers = new GenericClass<>(2018, 2022);
		
		System.out.println(strings);
		System.out.println(integers);
		
		GenericClass<PersonForGenerics, PersonForGenerics> people = new GenericClass<>(new PersonForGenerics("Luis"), new PersonForGenerics("Enis"));
		System.out.println(people);
		
		GenericClass<String, Integer> nicknameAndAge = new GenericClass("Luis", 21);
		String nickname=nicknameAndAge.getFirst();
		Integer age=nicknameAndAge.getSecond();
		System.out.println("My nickname is "+nickname+" and I am "+age+" years old.");
		
		PersonForGenerics realName =people.getSecond();
		PersonForGenerics nickName = people.getFirst();
		System.out.println("My real name is "+realName+", but some people call me "+nickName+".");
		
		List<String> originalStringList = List.of("Enis", "Luis");
		List<String> reversedStringList = reverse(originalStringList);
		
		List<Integer> originalIntegerList = List.of(2018, 2022);
		List<Integer> reversedIntegerList = reverse(originalIntegerList);
		
		System.out.println("In the original String list my real name is first and my nickname is second: "+originalStringList.get(0)+",  "+originalStringList.get(1));
		System.out.println("In the reversed String list my real name is second and my nickname is first: "+reversedStringList.get(0)+",  "+reversedStringList.get(1));
		System.out.println("In the original Integer list the year i started university is first and the year I am expected to finish it is second: "+originalIntegerList.get(0)+",  "+originalIntegerList.get(1));
		System.out.println("In the reversed Integer list the year i started university is second and the year I am expected to finish it is first: "+reversedIntegerList.get(0)+",  "+reversedIntegerList.get(1));
		
		GenericClassComparable<Integer> comparedIntegers = new GenericClassComparable(21, 23);
		GenericClassComparable<String> comparedStrings = new GenericClassComparable("Enis","Luis");
		System.out.println("Between the 2 integers: "+comparedIntegers+", the largest is: "+comparedIntegers.getLargest());
		System.out.println("Between the 2 strings: "+comparedStrings+", the largest is: "+comparedStrings.getLargest());
	}
	
	private static <T> List<T> reverse(List<T> originalList) {
		List<T> reversedList = new ArrayList<>(originalList);
		Collections.reverse(reversedList);
		return reversedList;
	}

}
