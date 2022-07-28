var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var s = 1;

for (let i = 2; i <= 100; i++)
{
    s += parseFloat(1/i);
}

console.log(`${s.toFixed(2)}`);