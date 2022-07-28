var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a, b=0, c=0;
var d=0;
var ch='%';

a=parseFloat(lines.shift());

if(a>=0 && a<=400.00)
{
    b=parseFloat(a*0.15);
    c=parseFloat(a+b);
    d=parseInt(15);

}else if(a>=400.01 && a<=800.00){

    b=parseFloat(a*0.12);
    c=parseFloat(a+b);
    d=parseInt(12);

}else if(a>=800.01 && a<=1200.00){

    b=parseFloat(a*0.10);
    c=parseFloat(a+b);
    d=parseInt(10);

}else if(a>=1200.01 && a<=2000.00){

    b=parseFloat(a*0.07);
    c=parseFloat(a+b);
    d=parseInt(7);

}else if(a>2000.00){

    b=parseFloat(a*0.04);
    c=parseFloat(a+b);
    d=parseInt(4);
}

console.log(`Novo salario: ${c.toFixed(2)}`);
console.log(`Reajuste ganho: ${b.toFixed(2)}`);
console.log(`Em percentual: ${d} ${ch}`);
        