var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var numAlunos = parseInt(lines.shift());
var numPc = parseInt(lines.shift());
var qtsPcsQuebrados = parseInt(lines.shift());
var qtsPcsSemComp = parseInt(lines.shift());


if (numPc - (numAlunos + qtsPcsQuebrados + qtsPcsSemComp + 1) >= 0){
    console.log("Igor feliz!");
} 
else {
    if ((qtsPcsSemComp / 2) < qtsPcsQuebrados) console.log("Caio, a culpa eh sua!");
    else console.log("Igor bolado!");
}