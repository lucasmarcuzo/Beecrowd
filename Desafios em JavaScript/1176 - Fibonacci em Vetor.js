var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n1=0, n2=1, n3=0;
var x=parseInt(lines.shift());

var vet = new Array(61);
var vety = new Array(x);

for (let i = 0; i < x; i++)
{
    vety[i]=parseInt(lines.shift());
}
    
for (let j = 1; j < 61; j++)
{
    n1=n2;
    n2=n3;
    n3=n1+n2;
    vet[j]=n3;
}
vet[0]=0;
for (let m = 0; m < x;) {

    for (let k = 0; k < 61; k++) {

        if(vety[m] == k){
            var strLong = vet[k];
            console.log(`Fib(${vety[m]}) = ${strLong}`);
        }    
    }
    m++;  
}