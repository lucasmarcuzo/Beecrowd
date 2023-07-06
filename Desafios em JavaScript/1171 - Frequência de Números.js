const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const valores = parseInt(lines[0]);
const numeros = new Map();

for (let i = 1; i <= valores; i++) {
  const numero = parseInt(lines[i]);

  if (numeros.has(numero)) {
    numeros.set(numero, numeros.get(numero) + 1);
  } else {
    numeros.set(numero, 1);
  }
}

Array.from(numeros.entries())
  .sort((a, b) => a[0] - b[0])
  .forEach((entry) => {
    console.log(`${entry[0]} aparece ${entry[1]} vez(es)`);
  });
