import java.util.Scanner;

//Developed by: @LucasMarcuzo

class Main2483{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        String natal = "Feliz nat";

        for (var i = 0; i < x; i++)
        {
            natal += "a";
        }

        natal += "l!";

        System.out.println(natal);

        scan.close();

    }

}