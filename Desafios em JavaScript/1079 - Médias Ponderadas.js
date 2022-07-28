var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n; 
var x, y, z;

n=parseInt(lines.shift());

var vet = new Array(n);

for (let i = 0; i < n; i++)
{
    var ln = lines.shift().split(" ");

    x=parseFloat(ln.shift());
    y=parseFloat(ln.shift());
    z=parseFloat(ln.shift());

    vet[i]=parseFloat((x*2 + y*3 + z*5)/10);
}

for (let j of vet)
{
    console.log(`${j.toFixed(1)}`);
}