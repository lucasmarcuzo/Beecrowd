using System;
using System.Collections.Generic;
using System.Linq;

class URI {

    static void Main(string[] args) { 
	  
        List<int> teste = new List<int>();
        int total = 0;
        
        while (true) { 

            String str = Console.ReadLine();
            if (string.IsNullOrEmpty(str))
            {
                break;   
            }
            else          
            { 
                total = 0;
                String letrasEntrada = str;    
                char[] letrasET = letrasEntrada.ToCharArray();

                String letrasEntradaComparar = Console.ReadLine();
                char[] letrasFrase = letrasEntradaComparar.Replace("\\s+","").ToCharArray();

                for (int k = 0; k < letrasET.Length; k++) {
                    for (int i = 0; i < letrasFrase.Length; i++) {
                        if(letrasFrase[i] == letrasET[k]){
                            total++;
                        }
                    }
                }
                teste.Add(total);
            }    
        }

        if(teste.Any()){
            foreach (int i in teste) {
                Console.WriteLine(i);
            }
        }
    }
}