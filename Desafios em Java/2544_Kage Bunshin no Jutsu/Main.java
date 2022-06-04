//Developed by: @LucasMarcuzo

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			System.out.println(log2(N));
		}
	}
	
	private static int log2(int N) {
		return (int) (Math.log(N) / Math.log(2));
	}
	
}