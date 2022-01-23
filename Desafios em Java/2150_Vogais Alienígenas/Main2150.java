import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
	  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> teste = new ArrayList<>();
        int total = 0;
        String str;
        
        while ((str = br.readLine()) != null) {   
           
            if (str.equals(""))
            {
                break;   
            }
            else          
            { 
                total = 0;
                String letrasEntrada = str;    
                char[] letrasET = letrasEntrada.toCharArray();

                String letrasEntradaComparar = br.readLine();
                char[] letrasFrase = letrasEntradaComparar.replaceAll("\\s+","").toCharArray();

                for (int k = 0; k < letrasET.length; k++) {
                    for (int i = 0; i < letrasFrase.length; i++) {
                        if(letrasFrase[i] == letrasET[k]){
                            total++;
                        }
                    }
                }
                teste.add(total);
            }    
        }

        if(!teste.isEmpty()){
            for (Integer i : teste) {
                System.out.println(i);
            }
        }        
    }
}