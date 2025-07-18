/*
JavaScript programs work with numbers using the arithmetic operators
. that the language provides. These include + for addition, - for
subtraction, * for multiplication, / for division, and % for modulo
(remainder after division). ES2016 adds ** for exponentiation.
 */

let a = 10
let b = 5

// Addition
let sum = a + b
console.log(`Sum: ${sum}`) // 15

// Subtraction
let difference = a - b
console.log(`Difference: ${difference}`) // 5

// Multiplication
let product = a * b
console.log(`Product: ${product}`) // 50

// Division
let quotient = a / b
console.log(`Quotient: ${quotient}`) // 2

// Modulo
let remainder = a % b
console.log(`Remainder: ${remainder}`) // 0

// Exponentiation
let power = a ** b
console.log(`Power: ${power}`) // 100000

// Arithmetic operations
console.log(`This is a math floor operation: ${Math.floor(3.7)}`) // 3
console.log(`This is a math ceil operation: ${Math.ceil(3.1)}`) // 4
console.log(`This is a math round operation: ${Math.round(3.5)}`) // 4
console.log(`This is a math abs operation: ${Math.abs(-5)}`) // 5
console.log(`This is a math max operation: ${Math.max(1, 2, 3)}`) // 3
console.log(`This is a math min operation: ${Math.min(1, 2, 3)}`) // 1
console.log(`This is a math random operation: ${Math.random(10, 20)}`) // Random number between 0 and 1
console.log(`This is a math sqrt operation: ${Math.sqrt(16)}`) // 4
console.log(`This is a math pow operation: ${Math.pow(2, 3)}`) // 8