/*
Array is a special variable that can hold multiple values at a time unlike other type of variables that holds only a single value
In a nutshell arrays are collections
*/

// Define an array
let fruits = ["Apple", "Banana", "Cherry"] // array of fruits
console.log(fruits)

// Accessing arrays

/*
To access array elements, we use the index number.Remember array indices start at zero
*/

console.log(fruits[0]) // printing the first element

console.log(fruits[2]) // Cherry => last element of the array

// Array methods

/*
Arrays comes in with multiple built-in methods to manipulate data

The methods are as follows:
push(): Is used to add an element at the end of an array
pop(): Is used to remove the last element from an array
shift(): Removes the first element from the array
unshift(): Adds an element at the beiginning of an array

*/

// adding element at the end
fruits.push("Mango")
console.log("The new array after pushing an element", fruits)

// adding element at the beginning
fruits.unshift("Orange")
console.log("The new array after unshifting an element", fruits)

// removing the last element
fruits.pop()
console.log("The new array after popping an element", fruits)

// removing the first element
fruits.shift()
console.log("The new array after shifting an element", fruits)

// obtaining a section of the array without modifying it
console.log(slicedFruits = fruits.slice(1)) // slicing the array from index 1 to the end

// Finding the length of an array
console.log("The length of the array is", fruits.length) // returns the number of elements

