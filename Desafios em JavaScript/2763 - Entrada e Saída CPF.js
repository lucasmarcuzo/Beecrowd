var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var cpf = lines.shift(); 

var cpf_completo = [4];

cpf_completo[0]=cpf.substring(0,3); 
cpf_completo[1]=cpf.substring(4,7); 
cpf_completo[2]=cpf.substring(8,11); 
cpf_completo[3]=cpf.substring(12,14); 

for (let i of cpf_completo)
{
    console.log(i);
}
