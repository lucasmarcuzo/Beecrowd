var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var a, b, c, r1, r2;

a=parseFloat(lines.shift());
b=parseFloat(lines.shift());
c=parseFloat(lines.shift());

if((a === 0) || (((b*b) - (4*a*c)) < 0)) 
{
    console.log("Impossivel calcular");
}
else
{
    r1 = parseFloat(((-b + Math.sqrt(((b*b) - (4*a*c)))) / (2*a)));
    r2 = parseFloat(((-b - Math.sqrt(((b*b) - (4*a*c)))) / (2*a)));

    console.log(`R1 = ${r1.toFixed(5)}`);
    console.log(`R2 = ${r2.toFixed(5)}`);
}