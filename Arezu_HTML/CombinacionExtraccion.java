import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream; 

public class CombinacionExtracción {

	public static void main(String[] args) {
		 
        Stream<String> Libro = Stream.of("Crónicas del desierto", "Harry Potter", "La Iliada"); 
        Stream<String> Autor = Stream.of("Funke", "Greco", "Millán"); 
        Stream.concat(Libro, Autor) 
            .forEach(element -> System.out.println(element)); 	
			
	  }
	}
