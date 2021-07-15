using System; 

//Developed by: @LucasMarcuzo
class URI1049 {

    static void Main(string[] args) { 

        string a, b, c, total="";

        a=Convert.ToString(Console.ReadLine());
        b=Convert.ToString(Console.ReadLine());
        c=Convert.ToString(Console.ReadLine());
        

        if(a == "vertebrado"){

            if(b == "ave"){

                if(c == "carnivoro"){

                    total = "aguia";

                }else if(c == "onivoro"){

                    total = "pomba";

                }

            }else if(b == "mamifero"){

                if(c == "onivoro"){

                    total = "homem";

                }else if(c == "herbivoro"){

                    total = "vaca";

                }
            }
        
        
        }else if(a == "invertebrado"){

            if(b == "inseto"){

                if(c == "hematofago"){

                    total = "pulga";

                }else if(c == "herbivoro"){

                    total = "lagarta";

                }

            }else if(b == "anelideo"){

                if(c == "hematofago"){

                    total = "sanguessuga";

                }else if(c == "onivoro"){

                    total = "minhoca";

                }
            }
        }

            Console.WriteLine(total);

    }

}