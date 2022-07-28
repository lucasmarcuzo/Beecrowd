var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N,X,a;
    
N=parseInt(lines.shift());

for(a=1;a<=N;a++){

    X=parseInt(lines.shift());

    if(X === 0){

        console.log("NULL");

    }else if(X<=0 && X % 2 === 0){

        console.log("EVEN NEGATIVE");

    }else if(X <= 0 && X % 2 === -1){

        console.log("ODD NEGATIVE");

    }else if(X >= 0 && X % 2 === 0){

        console.log("EVEN POSITIVE");

    }else if(X >= 0 && X %2 === 1){

        console.log("ODD POSITIVE");
    }
}