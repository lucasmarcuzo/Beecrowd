var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var b = parseFloat(lines[0]);
var n = new Array(100);
n[0] = b;

for (var a = 0; a < 100; a++) {
  var formattedValue = n[a].toLocaleString('en-US', { minimumFractionDigits: 4, useGrouping: false });
  console.log(`N[${a}] = ${formattedValue.replace(',', '.')}`);
  b /= 2;
  n[a + 1] = b;
}