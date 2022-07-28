var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var notes, aux;

notes=parseInt(lines.shift());

var na = parseInt(notes/365);
console.log(`${na} ano(s)`);
aux = (notes%365);

var nm = parseInt(aux/30);
console.log(`${nm} mes(es)`);
aux = (aux%30);

var nd = parseInt(aux/1);
console.log(`${nd} dia(s)`);