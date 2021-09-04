using System;
using System.Collections.Generic;

namespace _3163___Controlador_de_Vôo
{

    class Program
    { 
        public static Queue<string> Oeste = new Queue<string>();  
        public static Queue<string> Sul = new Queue<string>();  
        public static Queue<string> Norte = new Queue<string>();  
        public static Queue<string> Leste = new Queue<string>();  

        public static Queue<string> Total = new Queue<string>(); 

        public static void Main(String[] args) {
        
            //(-4 representa o lado leste, -3 o lado norte, -2 lado sul e -1 lado oeste)
            
            int PC = int.Parse(Console.ReadLine());
        
            switch (PC) {
                
                case -1:
                    Adc(Oeste);
                    break;
                case -2:
                    Adc(Sul);
                    break;
                case -3:
                    Adc(Norte);   
                    break;
                case -4:
                    Adc(Leste);
                    break;
            }
        }

        public static void Adc(Queue<string> PC){

            while(true){

                string Pouso = Console.ReadLine();

                if(Pouso == "0"){
                    break;
                }else if(Pouso == "-1"){
                    PC = Oeste;
                }else if(Pouso == "-2"){
                    PC = Sul;
                }else if(Pouso == "-3"){
                    PC = Norte;
                }else if(Pouso == "-4"){
                    PC = Leste;
                }
                else{  
                    PC.Enqueue(Pouso);
                }
            
            }

            int tamanho = Oeste.Count + Sul.Count + Norte.Count + Leste.Count;
            for (int i = 0; i < tamanho; i++) {
            
                if(Oeste.Count != 0){
                    Total.Enqueue(Oeste.Dequeue());
                }
                if(Norte.Count != 0){
                    Total.Enqueue(Norte.Dequeue());
                }
                if(Sul.Count != 0){
                    Total.Enqueue(Sul.Dequeue());
                }
                if(Leste.Count != 0){
                    Total.Enqueue(Leste.Dequeue());
                }
            
            }

            Imprimir();

        }

        
        
        public static void Imprimir(){

            string f = " ";
            foreach(string t in Total){ f += t + " "; }
            
            Console.WriteLine(f.Trim());    
        }




    }
}
