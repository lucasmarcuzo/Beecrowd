var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num, horas;
var salario, total;

num=parseInt(lines.shift());
horas=parseInt(lines.shift());
salario=parseFloat(lines.shift());

total=parseFloat(horas*salario);

console.log(`NUMBER = ${num}`);
console.log(`SALARY = U$ ${total.toFixed(2)}`);