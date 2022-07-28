var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var vet = new Array(20);

var j=0;

for (let i = 0; i <vet.length; i++)
{
    vet[i]=parseInt(lines.shift());
}
        
var rev = new Array(20);

for (let i = 0, k = 19; i < 20; i++, k--) {          
    rev[i]=vet[k];
}

for(let n of rev)
{ 
    console.log(`N[${j}] = ${n}`);
    j++;
}