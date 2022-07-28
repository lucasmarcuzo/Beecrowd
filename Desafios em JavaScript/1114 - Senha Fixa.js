var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var senha="2002";  
var senhauser; 

do{                    
    senhauser=lines.shift();

    if(senha !== senhauser){

        console.log("Senha Invalida"); 
    }

}while(senha !== senhauser);               

console.log("Acesso Permitido"); 