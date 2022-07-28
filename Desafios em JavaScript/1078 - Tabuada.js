var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x=parseInt(lines.shift());
var divisors = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

for (let i = 0; i < divisors.length; i++) 
{
    let dividendo = parseInt(x);
    let divisor = parseInt(divisors[i]);
    let longResult = (dividendo * divisor);
    console.log(`${divisor} x ${dividendo} = ${longResult}`);
}
