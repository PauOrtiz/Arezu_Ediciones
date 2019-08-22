
public class HilosLambdas {

	public static void main(String[] args) {
		new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                     System.out.println("NÚMERO DE HILO " + i);
            }
        }).start();
    }

	}