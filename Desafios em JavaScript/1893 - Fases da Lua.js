var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var inicio = parseInt(lines.shift());
var fim = parseInt(lines.shift());

if(inicio >= 0 && fim <= 2 ) 
{
    console.log("nova");
}
else if(inicio >= 3 && fim <= 96 && inicio > fim)
{ 
    console.log("minguante");
}
else if(fim >= 97 && inicio <= 100)
{
    console.log("cheia");
}
else if (fim >= 3 && inicio <= 96)
{
    console.log("crescente");
}