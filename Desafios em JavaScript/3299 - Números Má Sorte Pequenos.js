var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = lines.shift();

if (num.includes("13")) 
{
    console.log(`${num} es de Mala Suerte`);
}
else 
{
    console.log(`${num} NO es de Mala Suerte`);
}