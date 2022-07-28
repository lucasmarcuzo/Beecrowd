var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n, x=0, y=0;

n=parseInt(lines.shift());

vet = new Array(n);

for(let i = 0; i <vet.length; i++){

    vet[i]=parseInt(lines.shift());
    
    if(vet[i] >= 10 && vet[i] <= 20)
    {
        x++;
    }
    else
    {
        y++;
    }
}

console.log(`${x} in`);
console.log(`${y} out`);