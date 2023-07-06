var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

if(lines.length > 1){
    var ln1 = lines.shift().split(' ');
    var ln2 = lines.shift().split(' ');
}
else var ln1 = lines.shift().split(' ');  

var n1, n2, n3, n4, media, exame;

n1 = parseFloat(ln1.shift());
n2 = parseFloat(ln1.shift());
n3 = parseFloat(ln1.shift());
n4 = parseFloat(ln1.shift());

media = parseFloat(((n1*2 + n2*3 + n3*4 + n4*1) / (2 + 3 + 4 + 1)));

if (media >= 7.0){

    console.log(`Media: ${media.toFixed(1)}`);
    console.log(`Aluno aprovado.`);

}
else{

    if (media < 5.0){

        media -= 0.01;
        console.log(`Media: ${media.toFixed(1)}`);
        console.log(`Aluno reprovado.`);

    }
    else{

        media -= 0.01;
        console.log(`Media: ${media.toFixed(1)}`);
        console.log(`Aluno em exame.`);
        exame = parseFloat(ln2.shift());
        console.log(`Nota do exame: ${exame.toFixed(1)}`);
        media = (media + exame)/2;
        if (media >= 5.0){
            console.log(`Aluno aprovado.`);
        }
        else{
            console.log(`Aluno reprovado.`);
        }

        console.log(`Media final: ${media.toFixed(1)}`);
    }
}