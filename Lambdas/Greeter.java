package Lambdas;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main (String[] args) {
		//Creating an instance of  class and using it(calling it and its method)
		Greeter greeter = new Greeter();
		HellowWorldGreeting hellowWorldGreeting = new HellowWorldGreeting();
		greeter.greet(hellowWorldGreeting);
		
		
		//Creating a lambda and implement it(its method from the functional interface)
		Greeting LambdaGreeting = () -> System.out.println("Hello World");
		LambdaGreeting.perform();
		//The other way how we can use the lambda
		greeter.greet(LambdaGreeting);
		
		Greeting hellowWorldGreeting2 = new HellowWorldGreeting();
		greeter.greet(hellowWorldGreeting2);
		
		//The first way when talking to a type inference
		StringLength stringLengthLambda = s -> s.length();
		System.out.println("The length of the word 'Hello' is " + stringLengthLambda.getLength("Hello"));
		//Second way of doing it
		printLambdaLength(s -> s.length());
		
		
		//How we can use runnable without lambdas:
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}
		});
		myThread.run();
		//Now how we can use runnable with lambdas(and this is possible because runnable is a functional interface, so has only 1 method)
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		myLambdaThread.run();
	}
	
	public static void printLambdaLength(StringLength l) {
		System.out.println("The length of the word 'Hello' is " + l.getLength("Hello"));
	}
	
	

}
