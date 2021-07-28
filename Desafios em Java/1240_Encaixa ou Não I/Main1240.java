//Developed by: @LucasMarcuzo

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main1240 {

    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int casos = Integer.parseInt(in.readLine());

        for (int i = 0; i < casos; i++)
        {   
            String[] P = in.readLine().split("\\s");

            String primeiro = P[0];
            String segundo = P[1];

            int tam = primeiro.length() - segundo.length();

            if (primeiro.length() < segundo.length())
            {
                out.println("nao encaixa");
            }
            else
            {
                out.println(primeiro.startsWith(segundo, tam) ? "encaixa" : "nao encaixa");                  
            }
        }

        out.close();

    
    }
}