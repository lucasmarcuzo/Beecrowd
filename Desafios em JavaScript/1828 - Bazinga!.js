var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var qtdTeste = parseInt(lines.shift());
var v1, v2;

for (let i = 1; i <= qtdTeste; i++)
{
    let ln = lines.shift().split(" ");

    v1 = ln.shift().replace("\r", "");
    v2 = ln.shift().replace("\r", "");

    if((v1 === "tesoura" && v2 === "papel")||(v1 === "papel" && v2 === "pedra") 
    || (v1 === "pedra" && v2 === "lagarto") || (v1 === "lagarto" && v2 === "Spock")
    || (v1 === "Spock" && v2 === "tesoura") || (v1 === "tesoura" && v2 === "lagarto")
    || (v1 === "lagarto" && v2 === "papel") || (v1 === "papel" && v2 === "Spock")
    || (v1 === "Spock" && v2 === "pedra") || (v1 === "pedra" && v2 === "tesoura")){

        console.log(`Caso #${i}: Bazinga!`);          
            
    }else if(v1 === v2){
        
        console.log(`Caso #${i}: De novo!`);
            
    }else{
        
        console.log(`Caso #${i}: Raj trapaceou!`);
    }     
}