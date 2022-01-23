using System;
using System.Collections.Generic;

public class main {

	static void Main(string[] args) { 
	  
        int valores = int.Parse(Console.ReadLine());
        SortedDictionary<int, int> numeros = new SortedDictionary<int, int>();

        for (int i = 0; i < valores; i++) {
            var numero = int.Parse(Console.ReadLine());

            if(numeros.ContainsKey(numero)) {
               numeros[numero] += 1;
            } else {
                numeros.Add(numero, 1);
            }
        }

        foreach (KeyValuePair<int, int> n in numeros) {
            Console.WriteLine("{0} aparece {1} vez(es)", n.Key, n.Value);
        }

    }
}