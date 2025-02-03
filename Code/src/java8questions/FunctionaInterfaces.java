package java8questions;

import java.util.function.*;

public class FunctionaInterfaces {

	public static void main(String[] args) {
	
		//Runnable
		Runnable task = () -> System.out.println("Running task!");
		new Thread(task).start();

		//1. Predicate<T> -> test
		Predicate<Integer> isEven = number -> number % 2 == 0;
		System.out.println(isEven);
		//1 .BiPredicate<T, U> --> test
		BiPredicate<Integer, Integer> areEqual = (a, b) -> a == b;
		System.out.println(areEqual);
		


		//Function<T, R> -> apply()
		Function<Integer, String> intToString = number -> "Number: " + number;
		System.out.println(intToString.apply(10));

		//BiFunction<T, U, R> apply()
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		System.out.println(add.apply(5, 3));  // 8

		//UnaryOperator<T> --> apply()
		UnaryOperator<Integer> square = x -> x * x;
		System.out.println(square.apply(4));  // 16

		//BinaryOperator<T> --> apply()
		BinaryOperator<Integer> multiply = (a, b) -> a * b;
		System.out.println(multiply.apply(3, 4));  // 12



		//Supplier<T> --> get()
		Supplier<String> stringSupplier = () -> "Hello, World!";
		System.out.println(stringSupplier.get());

		//Consumer<T> --> accept()
		Consumer<String> printMessage = message -> System.out.println(message);
		printMessage.accept("Hello, Consumer!");

	}

}
