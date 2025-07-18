/*
In JavaScript base 10 integers are written as a sequence of digits ie 2, 5858 etc in addition the base 16 integers are written as 0x followed by a sequence of digits and letters ie 0x2, 0x5858 etc.
*/

let base10Integer = 2
console.log(`This is a base 10 integer: ${base10Integer}`)

let base16Integer = 0xff
console.log(`This is a base 16 integer: ${base16Integer}`)

let base2Integer = 0b10
console.log(`This is a base 2 integer: ${base2Integer}`)

// exponent notation
let exponentInteger = 2e3 // or 2E3 or 2 * 10^3
console.log(`This is an exponent notation integer: ${exponentInteger}`)