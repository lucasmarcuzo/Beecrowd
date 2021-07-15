using System; 

//Developed by: @LucasMarcuzo

class URI1142 {
    static void Main(string[] args) { 

        int n, num=1;

        n=int.Parse(Console.ReadLine());

        for (int i = 1; i <= n; i++){

            for(;num <=4*n; num++){
		
			    if((num % 4) == 0){
                    
				    Console.WriteLine("PUM");

			    }else{
				    
                    Console.Write("{0} ", num);
			    }
		    }
        }
    }
}