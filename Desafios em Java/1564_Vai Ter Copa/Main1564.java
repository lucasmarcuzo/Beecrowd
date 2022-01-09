import java.io.*;

//Developed by: @LucasMarcuzo

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        
        while((str = br.readLine()) != null)
        {
            if (str.equals(""))
            {
                break;   
            }
            else          
            { 
                int x = Integer.parseInt(str);

                if (x <= 0)
                {
                    System.out.println("vai ter copa!"); 
                }
                else
                {
                     System.out.println("vai ter duas!");
                }
            }
        }
    }

}