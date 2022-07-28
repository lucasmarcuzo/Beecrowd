var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let line = lines.shift().split(' ');
let soma = 0

for(i=0;i< line.length;i++){
  let transfor = parseInt(line[i]);
  soma += transfor;
}
console.log(soma-3);