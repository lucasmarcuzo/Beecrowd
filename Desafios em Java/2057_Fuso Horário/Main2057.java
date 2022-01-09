import java.util.Scanner;

//Developed by: @LucasMarcuzo

public class Main2057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();

        int total = (horasaida + tempoviagem + fuso);
		
        if(total >= 24){

            total = (total - 24);
        }
        else if (total < 0)
        {
            total = (24 + total);
        }
           	
		System.out.println(total);
		
		sc.close();
	}
}