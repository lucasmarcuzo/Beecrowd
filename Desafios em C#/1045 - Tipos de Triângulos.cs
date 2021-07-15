using System; 
using System.Globalization;

//Developed by: @LucasMarcuzo
class URI1045 {

    static void Main(string[] args) { 

        double a, b, c, primeiro, segundo, terceiro;

        double[] valor = new double[4];

        string[] s = Console.ReadLine().Split(' ');

        a = double.Parse(s[0], CultureInfo.InvariantCulture);
        b = double.Parse(s[1], CultureInfo.InvariantCulture);
        c = double.Parse(s[2], CultureInfo.InvariantCulture);

        if (a >= b && a >= c){

		    primeiro = a;
	        segundo = b;
		    terceiro = c;

	    }


	    if (b >= a && b >= c){

		    primeiro = b;
	        segundo = a;
		    terceiro = c;

	    }else{

		    primeiro = c;
		    segundo = a;
		    terceiro = b;

	    }


        valor[0]=Math.Pow(primeiro,2);
        valor[1]=Math.Pow(segundo,2);
        valor[2]=Math.Pow(terceiro,2);

        valor[3]=valor[1] + valor[2];

        
        if(primeiro >= segundo + terceiro){

            Console.WriteLine("NAO FORMA TRIANGULO");

        }else{
        
            if(valor[0] == valor[3]){

                Console.WriteLine("TRIANGULO RETANGULO");

            }if( valor[0] >  valor[3]){

                Console.WriteLine("TRIANGULO OBTUSANGULO");
            
            }if( valor[0] < valor[3]){

                Console.WriteLine("TRIANGULO ACUTANGULO");
            
            }if( valor[0] ==  valor[1] &&  valor[1] ==  valor[2]){

                Console.WriteLine("TRIANGULO EQUILATERO");

            }if (valor[0] == valor[1] && valor[0] != valor[2] && valor[2] != valor[1]){

                Console.WriteLine("TRIANGULO ISOSCELES");

	        }if (valor[1] == valor[2] && valor[0] != valor[1] && valor[0] != valor[2]){

		        Console.WriteLine("TRIANGULO ISOSCELES");

	        }if (valor[0] == valor[2] && valor[2] != valor[1] && valor[0] != valor[1]){

                Console.WriteLine("TRIANGULO ISOSCELES");

            }
        
        }  

    }

}