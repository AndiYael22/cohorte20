// Escribe tu código aquí.
const myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];
let cadena=[];
var palabra= prompt("escribe una palabra")

function uno(palabra, myArray) {

    for (var i = 0; i < myArray.length; i++) {
        if (myArray[i].length > palabra.length) {
          cadena=myArray[i];
         console.log(cadena);
    }}

return cadena
}
uno(palabra, myArray);