let x=10;
console.log(x);
let persona= {
 nombre:"juan",
 apellido:"perez",
 nombreCompleto: function () {
   return "el nombre completo es "+this.nombre+" "+this.apellido;
}
}

for (nombrepropiedad in persona) {

   console.log(nombrepropiedad);
   console.log("valor: "+ persona[nombrepropiedad]);
}

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());

console.log(persona["apellido"]);
persona.tel="984984398398"


let persona1=new Object();
persona1.edad=23;
console.log(persona1);
console.log(persona1.edad);
