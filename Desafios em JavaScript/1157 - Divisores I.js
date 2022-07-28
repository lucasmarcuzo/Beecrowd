var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n=parseInt(lines.shift());

for (let i = 1; i <= n; i++)
{
    if(n % i === 0){

        console.log(i);
    }
}