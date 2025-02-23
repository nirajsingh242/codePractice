import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8FunctionalInterfaces {
	public static void main(String[] args) {
		
		Predicate<Integer> predicate= e -> e==2;
		BiPredicate<Integer,String> biPredicate= (e , s)-> (e==2 && s.length()==2);
		
		Consumer<String> consume=e->System.out.println(e);
		
		Function<Integer,String> func= e -> {
												if(e==2)
												return "Two";
												return "invalid input";
											};
											
		BiFunction<Integer,String,String> bifunc= (e,s) -> {
												if(e==2&&s.length()==2)
												return "Two";
												return "invalid input";
											};
											
		Supplier<String> supplier=()->{return "Hello world";};									
					
		
		System.out.print(supplier.get());
		System.out.print(bifunc.apply(2, "AA"));
		consume.accept("consume hello world");
		
		List<Integer> value =Arrays.asList(23,45,78);
		List<Integer> value1 = new ArrayList<>(){
			{
				add(1);
				add(2);
				
			}
		};
		ListIterator<Integer> list=value1.listIterator();
		while(list.hasNext())
		{
			list.remove();
			System.out.println(list.next());
			
		}
		
											
}
}
