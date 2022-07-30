var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var ln = lines.shift().split(" ");

var volumeInicial = parseInt(ln.shift());
var numModificacoes = parseInt(ln.shift());
var totalVolume = volumeInicial;

var ln1 = lines.shift().split(" ");
for(let i = 0; i < numModificacoes; i++){
    totalVolume += parseInt(ln1.shift());
    if(totalVolume < 0) totalVolume = 0;
    else if(totalVolume > 100) totalVolume = 100;
}
    
console.log(`${totalVolume}`);