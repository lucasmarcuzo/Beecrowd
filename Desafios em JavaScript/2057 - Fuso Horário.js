var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var horasaida = parseInt(lines.shift());
var tempoviagem = parseInt(lines.shift());
var fuso = parseInt(lines.shift());

var total = (horasaida + tempoviagem + fuso);

if(total >= 24)
{
    total = (total - 24);
}
else if (total < 0)
{
    total = (24 + total);
}
       
console.log(total);