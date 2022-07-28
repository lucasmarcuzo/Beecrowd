import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String vl = sc.next();

		String[] nomes = new String[10];
		
		for(int i = 0 ; i < 10 ; i++){
			nomes[i] = sc.nextLine();
		}
		
		for(int i = 1 ; i <= 10 ; i++){
		  	if(i == 2 || i == 6 || i == 8){
			  System.out.println(nomes[i]);
			}
		}
	}
}