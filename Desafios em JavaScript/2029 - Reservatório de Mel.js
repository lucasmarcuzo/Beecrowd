var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var V, D, R, area, altura;
    	
while (lines.length > 0) {
  
    V = parseFloat(lines.shift());
    D = parseFloat(lines.shift());
    R = D / 2;
    area = ((3.14 * R) * R);
    altura = V / area;
    
    console.log(`ALTURA = ${altura.toFixed(2)}`);
    console.log(`AREA = ${area.toFixed(2)}`);
}