var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var TOPS = [1, 3, 5, 10, 25, 50, 100];
        
var K = parseInt(lines.shift());

if(K == TOPS[0]) console.log("Top 1");
else if(K <= TOPS[1]) console.log("Top 3");
else if(K <= TOPS[2]) console.log("Top 5");
else if(K <= TOPS[3]) console.log("Top 10");
else if(K <= TOPS[4]) console.log("Top 25");
else if(K <= TOPS[5]) console.log("Top 50");
else console.log("Top 100");