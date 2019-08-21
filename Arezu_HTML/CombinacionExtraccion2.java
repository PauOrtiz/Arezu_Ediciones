
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream; 

public class CombinacionExtracción {

	public static void main(String[] args) {
		 
        Stream<String> libro = Stream.of("Crónicas del desierto", "Harry Potter", "La Iliada"); 
        Stream<String> autor = Stream.of("Funke", "Greco", "Millán"); 
        System.out.println("****Método Concat*****");
        Stream.concat(libro, autor) 
            .forEach(System.out::println); 
        System.out.println("****Método Generate*****");
        Stream<Integer> aleatorios = Stream.generate( () -> (new Random()).nextInt(20) );
        aleatorios.limit(3).forEach( System.out::println); 
	  }
	}
