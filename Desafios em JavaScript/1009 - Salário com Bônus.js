var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var salario, totalvendas, total;
var nome="";

nome=lines.shift();
salario=parseFloat(lines.shift());
totalvendas=parseFloat(lines.shift());

total=parseFloat(salario + (totalvendas * 0.15));

console.log(`TOTAL = R$ ${total.toFixed(2)}`);