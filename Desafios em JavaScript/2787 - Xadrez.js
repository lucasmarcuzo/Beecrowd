var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());
var y = parseInt(lines.shift());

var xadrez = new Array(x);

for (let i = 0; i < y; i++)
{
    xadrez[i] = new Array(y);
}

for (let i = 0; i < x; i++)
{
    for (let j = 0; j < y; j++)
    {
        let o = i + j;
        if (o % 2 === 0)
        {
            xadrez[j][i] = parseInt(1);
        }
        else
        {
            xadrez[j][i] = parseInt(0);
        }
    }
}

var x1 = x-1;
var y1 = y-1;

var result = xadrez[y1][x1];

console.log(`${result}`);