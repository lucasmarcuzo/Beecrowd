var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var chico = 300 * parseInt(lines.shift());
var bento = 1500 * parseInt(lines.shift());
var bernardo = 600 * parseInt(lines.shift());
var marina = 1000 * parseInt(lines.shift());
var iara = 150 * parseInt(lines.shift());
var marlene = 225;
var total = chico + bento + bernardo + marina + iara + marlene;

console.log(`${total}`);