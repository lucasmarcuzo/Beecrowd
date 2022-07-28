var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var nomes = [];

for(let i = 0; i < 10; i++){
    nomes[i] = lines.shift();
}

for(let i = 1; i <= 10; i++){
      if(i == 2 || i == 6 || i == 8){
      console.log(nomes[i]);
    }
}