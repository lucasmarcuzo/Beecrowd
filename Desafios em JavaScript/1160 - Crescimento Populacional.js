var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

function calculateYearsToExceed(populationA, populationB, growthRateA, growthRateB) {
  let years = 0;

  while (populationA <= populationB) {
    populationA += Math.floor(populationA * (growthRateA / 100));
    populationB += Math.floor(populationB * (growthRateB / 100));
    years++;

    if (years > 100) {
      return -1; // Mais de 1 século
    }
  }

  return years;
}

function printResult(years) {
  if (years === -1) {
    console.log("Mais de 1 seculo.");
  } else {
    console.log(years + " anos.");
  }
}

var numCases = parseInt(lines.shift());

for (let i = 0; i < numCases; i++) {
  var [populationA, populationB, growthRateA, growthRateB] = lines
    .shift()
    .split(" ")
    .map(Number);

  var years = calculateYearsToExceed(populationA, populationB, growthRateA, growthRateB);
  printResult(years);
}
