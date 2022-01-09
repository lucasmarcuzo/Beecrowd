using System; 

//Developed by: @LucasMarcuzo

class URI {

    static void Main(string[] args) { 

        int x1,y1,x2,y2;

	    while(true){

            String[] linha = Console.ReadLine().Split(' ');

	    	x1 = int.Parse(linha[0]);
	    	y1 = int.Parse(linha[1]);
	    	x2 = int.Parse(linha[2]);
	    	y2 = int.Parse(linha[3]);
            
	    	if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0){
	    	    break; 
	    	}
	    	if(x1 == x2 && y1 == y2){
	    		Console.WriteLine("0");
	    	}	
	        else if((x2-x1) == -(y2-y1) || -(x2-x1) == -(y2-y1) || -(x2-x1) == (y2-y1) || (x2-x1) == (y2-y1)){
	        	Console.WriteLine("1");
	        }	
	    	else if(x1 == x2 || y1 == y2){
	    		Console.WriteLine("1");	
	    	}
	        else {
	        	Console.WriteLine("2");	
	        }
	    }

    }

}