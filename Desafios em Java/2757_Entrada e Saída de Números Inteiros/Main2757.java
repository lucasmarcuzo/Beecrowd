import java.io.IOException;
import java.util.Scanner;

//Developed by: @LucasMarcuzo

public class Main2757  {
	
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        
        System.out.printf("A = %d, B = %d, C = %d\n", A , B, C);
        System.out.printf("A = %10d, B = %10d, C = %10d\n", A , B, C);
        System.out.printf("A = %010d, B = %010d, C = %010d\n", A , B, C);
        System.out.printf("A = %-10d, B = %-10d, C = %-10d\n", A , B, C);
    }
	
}