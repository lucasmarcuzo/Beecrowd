var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y;
x=y=0;

x=parseInt(lines.shift());

var vet = [];

let ln = lines.shift().split(" ");

for (let i = 0; i < 5; i++) {
    vet.push(parseInt(ln.shift()));
}

for (let i = 0; i < vet.length; i++)
{
    if(x === vet[i])
    {
        y++;
    }
}

console.log(y);