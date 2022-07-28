var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var vetor=[];

for(let i=1; i < 101; i++){  
    vetor.push(parseInt(i));  
}

for(let j=1; j < vetor.length; j++){  

    if(vetor[j] % 2 === 0){

        console.log(vetor[j]);

    } 
}