var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y, z=0.0;

do{

    let ln = lines.shift().split(` `);
    x=parseInt(ln.shift());
    y=parseInt(ln.shift());

    if(x > z && y > z){

        console.log("primeiro");

    }else if(x < z && y > z){

        console.log("segundo");

    }else if(x < z && y < z){

        console.log("terceiro");

    }else if(x > z && y < z){

        console.log("quarto");
    }

}while(x !== 0 && y !== 0);
