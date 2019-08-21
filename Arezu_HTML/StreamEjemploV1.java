package stream;
import java.util.stream.*;


public class StreamEjemplo {
	
	public static void main(String[] args) {
		Stream<String> fruitStream = Stream.of("El jardín de las mariposas", "Lo único que me importa", "Largo pétalo del mar", "La novia gitana"); 
		fruitStream.filter(s -> s.contains("a"))
        		   .map(String::toUpperCase)
        		   .sorted()
        		   .forEach(System.out::println);	
	}

}