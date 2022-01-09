import java.io.IOException;
import java.text.DecimalFormat;

//Developed by: @LucasMarcuzo

public class Main {
 
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,##0.00");

        double x = 234.345;
        double y = 45.698;

        System.out.printf("%.6f - %.6f\n", x, y);
        System.out.printf("%d - %d\n", Math.round(x), Math.round(y));
        System.out.printf("%.1f - %.1f\n", x, y);
        System.out.printf("%s - %s\n", df.format(x), df.format(y));
        System.out.printf("%.3f - %.3f\n", x, y);
        System.out.printf("%.6e - %.6e\n", x, y);
        System.out.printf("%.6E - %.6E\n", x, y);
        System.out.printf("%.3f - %.3f\n", x, y);
        System.out.printf("%.3f - %.3f\n", x, y);

        
        
 
    }
 
}