var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var numsPares = [];  
var numsImpares = [];  
var impares = 0, pares = 0;

for(let i=0; i < 15; i++){
    var x = parseInt(lines.shift());

    if(x % 2 === 0){
        numsPares.push(x);
        pares++;
    }
    else{
        numsImpares.push(x);
        impares++;
    }

    if(impares == 5){
        for (let j = 0; j < 5; j++) {
            console.log(`impar[${j}] = ${numsImpares.shift()}`);
            impares = 0;
        }
    }
    else if (pares == 5){
        for (let j = 0; j < 5; j++) {
            console.log(`par[${j}] = ${numsPares.shift()}`);
            pares = 0;
        }
    }
}

var imparIndex=0;
var parIndex=0;
while(numsImpares.length !== 0){
    console.log(`impar[${imparIndex}] = ${numsImpares.shift()}`);
    imparIndex++;
}
while(numsPares.length !== 0){
    console.log(`par[${parIndex}] = ${numsPares.shift()}`);
    parIndex++;
}