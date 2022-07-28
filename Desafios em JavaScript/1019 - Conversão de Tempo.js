var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var tempo;
tempo=parseInt(lines.shift());

var hora = parseInt(tempo / 3600);
tempo = tempo - (hora * 3600);

var min = parseInt(tempo / 60);
tempo = tempo - (min * 60);

console.log(`${hora}:${min}:${tempo}`);