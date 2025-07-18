/*
Floating-point literals can have a decimal point; they use the traditionalsyntax for real numbers. A real value is represented as the integral part
of the number, followed by a decimal point and the fractional part of
the number.

Floating-point literals may also be represented using exponential
notation: a real number followed by the letter e (or E), followed by an
optional plus or minus sign, followed by an integer exponent. This
notation represents the real number multiplied by 10 to the power of
the exponent.
*/

let floatNumber = 3.14
console.log(`This is a float number: ${floatNumber}`)

let floatWithExponent = 1.5e3 // or 1.5E3 or 1.5 * 10^3
console.log(`This is a float number with exponent: ${floatWithExponent}`)