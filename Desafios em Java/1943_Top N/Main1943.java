import java.util.Scanner;

//Developed by: @LucasMarcuzo

public class Main1943 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
        
        int K = scan.nextInt();
        
        if(K == TOPS[0]) System.out.println("Top 1");
        else if(K <= TOPS[1]) System.out.println("Top 3");
        else if(K <= TOPS[2]) System.out.println("Top 5");
        else if(K <= TOPS[3]) System.out.println("Top 10");
        else if(K <= TOPS[4]) System.out.println("Top 25");
        else if(K <= TOPS[5]) System.out.println("Top 50");
        else System.out.println("Top 100");
        
        scan.close();
    }
}