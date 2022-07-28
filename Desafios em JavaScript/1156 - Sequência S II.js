var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var num = 0, j = 1;

for (let i = 1; i <= 39;)
{
    num += (i / j);
    i += 2;
    j *= 2;
}   

console.log(`${num.toFixed(2)}`);