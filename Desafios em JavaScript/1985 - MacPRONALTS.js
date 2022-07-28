var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n, cod, qtd;
var result=0;
n=parseInt(lines.shift());

var vet_cod = [1001, 1002, 1003, 1004, 1005];
var vet_val = [1.50, 2.50, 3.50, 4.50, 5.50];

for (let i = 0; i < n; i++)
{
    let ln = lines.shift().split(` `);

    cod=ln.shift();
    qtd=ln.shift();

    for (let j = 0; j < vet_val.length; j++)
    {
        if(cod == vet_cod[j])
        {
            result+=vet_val[j]*qtd;
        }
    }  
}

console.log(`${result.toFixed(2)}`);