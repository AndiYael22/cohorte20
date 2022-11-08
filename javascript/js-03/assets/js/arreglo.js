/* if (true) {
    var nombre="raul";
    
}
console.log(nombre); */
const numeros=[2,4,6,57,200]
 /*
numeros.forEach(function sumar(elemento) {
   suma=suma+elemento;
  console.log(suma);
});
console.log(suma); */

numeros.forEach((el, indice, arreglo ) => {
    console.log(el, indice, arreglo);
    
});
console.log(numeros);
//map genera una copia del arreglo original
let nuevoArreglo=numeros.map((el)=> {
   return el*el;
    
});
console.log(nuevoArreglo);


//filter crea una copia del arreglo original y permite filtrar
const frutas=["papaya", "manzana", "manzana", "uva"];
let frutasfiltraas=frutas.filter((fruta)=>fruta=="manzana");
console.log(frutasfiltraas);

frutasfiltraas=frutas.filter((fruta)=>fruta!=="manzana");
console.log(frutasfiltraas);

frutasfiltraas=frutas.filter((fruta)=>fruta.length<=3);
console.log(frutasfiltraas);

frutasfiltraas=frutas.filter((fruta)=>fruta.length>3);
console.log(frutasfiltraas);
