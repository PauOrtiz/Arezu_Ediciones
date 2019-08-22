import lambdas.Funcional;

public class UsoLambdas {

	public static void main(String[] args) {
		 Funcional s = (sl) -> "Bienvenid@"+" "+ sl +" "+"al curso de desarrollo de aplicaciones web con Jakarta EE ";
	        
	        System.out.println(s.saludo("Marina Arezu"));
	        System.out.println(s.saludame());

	}

}