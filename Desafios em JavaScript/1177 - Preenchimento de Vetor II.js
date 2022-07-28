var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var m, z=1000;

m=parseInt(lines.shift());

var vet=new Array(m);

for (let i = 0; i < m; i++)
{
    vet[i]=i;
}

for (let v=0, j=0; v < z; v++)
{
    console.log(`N[${v}] = ${vet[j]}`);
    j++;

    if(j == m)
    {
        j=0;
    }
}