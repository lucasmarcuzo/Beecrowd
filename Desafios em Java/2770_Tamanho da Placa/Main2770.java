//Developed by: @LucasMarcuzo

import java.io.IOException;
import java.util.Scanner;

public class Main2770 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {

			int X = scan.nextInt();
			int Y = scan.nextInt();
			int M = scan.nextInt();

			for (int i = 0; i < M; i++) {

				int Xi = scan.nextInt();
				int Yi = scan.nextInt();

				if ((X >= Xi && Y >= Yi) || (X >= Yi && Y >= Xi))   
					System.out.println("Sim");
				else
					System.out.println("Nao");
			}
		}
	}
	
}