var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var notas;
var xpto=[100,50,20,10,5,2,1];
var val=["100,00","50,00","20,00","10,00","5,00","2,00","1,00"];

notas=parseInt(lines.shift());

console.log(`${notas}`);
for(let i=0; i<xpto.length; i++)
{   
    let vr = parseInt(notas/xpto[i]);
    console.log(`${vr} nota(s) de R$ ${val[i]}`);       
    var aux=parseInt((notas % (xpto[i])));
    notas=aux;
}