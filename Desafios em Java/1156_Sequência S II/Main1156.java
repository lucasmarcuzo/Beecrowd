import java.io.IOException;

//Developed by: @LucasMarcuzo
 
public class Main1156 {
 
    public static void main(String[] args) throws IOException {

        double num = 0, j = 1;

        for (int i = 1; i <= 39;)
        {
            num += (i / j);
            i += 2;
            j *= 2;
        }   

        System.out.printf("%.2f\n", num);
    }
 
}