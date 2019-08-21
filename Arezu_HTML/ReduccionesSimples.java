import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import stream.ProductoInfo;


public class ReduccionesSimples { //página 28 Java SE8 for the really impatient

	public static void main(String[] args) {
		ProductoInfo p = new ProductoInfo("Harry Potter", "A789", 389.90, 130);
		ProductoInfo p2 = new ProductoInfo("Mundo de tinta", "A111", 230.00, 100);
		ProductoInfo p3 = new ProductoInfo("El señor de los anillos", "A467", 489.10, 200);
		ProductoInfo p4 = new ProductoInfo("Después de ti", "A754", 356.89, 10);
		
		List<ProductoInfo> products = new ArrayList<>(
				Arrays.asList(new ProductoInfo [] {p, p2, p3, p4})
		);
		
		System.out.println(products);
		
		Double sum = products.stream()
			.map(ProductoInfo::getPrice)
			.reduce((double) 0, (a, b) -> {
				return a + b;
			});
		
		System.out.println("El total es:"+sum);
		
		    
	}
	
}



