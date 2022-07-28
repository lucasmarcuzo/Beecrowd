var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var perimetro, area;
var valores=[6];      
var x=[3];

for(let i=0; i<3; i++){
    x[i]=parseFloat(lines.shift());
}
    valores[0]=x[0]+x[1];
    valores[1]=x[0]+x[2];
    valores[2]=x[1]+x[2];

    valores[3]=x[0]-x[1];
    valores[4]=x[0]-x[2];
    valores[5]=x[1]-x[2];

if (valores[3] < x[2] && x[2] < valores[0] && valores[4] < x[1] && x[1] < valores[1] && valores[5] < x[0] && x[0] < valores[2]){
    perimetro = parseFloat(x[0] + x[1] + x[2]);
    console.log(`Perimetro = ${perimetro.toFixed(1)}`);
}
else {
    area = parseFloat(((x[0]+x[1]) * x[2] )/ 2);
    console.log(`Area = ${area.toFixed(1)}`);
}