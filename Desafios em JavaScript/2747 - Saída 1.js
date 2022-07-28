var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var aux = "";
for (let i = 1; i < 40; i++) {
    aux += "-";
}

for (let i = 0; i < 5; i++) {
    
    aux += "\n";
    for (let j = 1; j < 40; j++) {

        if(j == 1 || j == 39){
            aux += ("|");
        }else{
            aux += (" ");  
        }
    }
}

aux += "\n";
for (let i = 1; i < 40; i++) {
    aux += "-";
}
console.log(aux);