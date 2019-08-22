import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class LambdaParametros {
    
	public void calcular() { //área hexágono
	Calculo c=(double p, double a)	->(p*a)/2;
	System.out.println("El área del hexágono es:"+ c.calcular(16.5, 34.2));
	}
	public static void main(String[] args) {
	LambdaParametros l=new LambdaParametros();
	l.calcular();
	}

}
