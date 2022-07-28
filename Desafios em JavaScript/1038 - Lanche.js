var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var x, y;
var z;
var cod = [1,2,3,4,5];
var valor = [4.00, 4.50, 5.00, 2.00, 1.50];

x=parseInt(lines.shift());
y=parseInt(lines.shift());

for (let i = 0; i < valor.length; i++) {
    if(x === cod[i]){
        z=parseFloat((y * valor[i]));
        console.log(`Total: R$ ${z.toFixed(2)}`);
    }
}