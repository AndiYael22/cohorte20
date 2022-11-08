/* crear una aplicación con JS,
recibir una palabra y va a regresar 
la palabra invertida
 */
let nombre = prompt("escribe tu nombre ");
const invertirnombre = nombre => nombre.split("").reverse().join("");
console.log("nombre invertido", invertirnombre(nombre));