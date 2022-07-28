var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var a, b, c, d;

a=parseInt(lines.shift());
b=parseInt(lines.shift());
c=parseInt(lines.shift());
d=parseInt(lines.shift());

var cd=c+d;
var ab=a+b;

if(b > c && d > a && cd > ab && c > 0 && d > 0)
{
    if(a % 2 === 0)
    {
        console.log("Valores aceitos");
    }
    else
    {
        console.log("Valores nao aceitos");
    }     
}
else
{
    console.log("Valores nao aceitos");
}    