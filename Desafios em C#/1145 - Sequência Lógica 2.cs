using System; 

//Developed by: @LucasMarcuzo

class URI1145 {

    static void Main(string[] args) { 

        int i=1, m, n, o=1;

        string[] linha = Console.ReadLine().Split(' ');

        m = int.Parse(linha[0]);
        n = int.Parse(linha[1]);

       do
       {
            if(o != m)
            {
			    o++;
			    Console.Write("{0} ", i);	

		    }
            else
            {
			    Console.Write("{0}\n", i);	
			    o=1;
		    } 
           
            i++;

       } while (i <= n);

    }

}