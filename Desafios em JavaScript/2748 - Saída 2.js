var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var aux = "";

tracos();

aux += ("\n");
for (let i = 0; i < 39; i++) {
    if(i === 0 || i === 38){
        aux += ("|");
    }
    else if(i == 10){
        aux += ("        Roberto                      ");
    }
}

espaco();

aux += ("\n");
for (let i = 0; i < 39; i++) {
    if(i === 0 || i === 38){
        aux += ("|");
    }
    else if(i == 10){
        aux += ("        5786                         ");
    }
}

espaco();

aux += ("\n");
for (let i = 0; i < 39; i++) {
    if(i === 0 || i === 38){
        aux += ("|");
    }
    else if(i == 10){
        aux += ("        UNIFEI                       ");
    }
}

aux += ("\n");
tracos();
console.log(aux);


function espaco(){
    aux += ("\n");
    for (let i = 0; i < 39; i++) {
        if(i === 0 || i === 38){
            aux += ("|");
        }
        else{
            aux += (" ");
        }   
    }
}

function tracos(){
    for (let i = 0; i < 39; i++) {
        aux += ("-");
    }
}
