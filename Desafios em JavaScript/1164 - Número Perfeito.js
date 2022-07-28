var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());

for (let i = 0; i < x; i++)
{
    var valor = 0, total = 0;

    valor = parseInt(lines.shift());

    for (let j = 1; j < valor; j++)
    {
        if (valor % j === 0)
        {
            total += j;
        }     
    }

    if(valor === total)
    {
        console.log(`${valor} eh perfeito`);
    }
    else
    {
        console.log(`${valor} nao eh perfeito`);
    }
}
