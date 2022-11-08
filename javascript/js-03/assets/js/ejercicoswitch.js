/* Escribir un programa que detecte el cupón que tiene el usuario
Bronce se le hará un descuento del 5 %
Plata se le hará un descuento del 10%
Oro se le hará un descuento del 20%
Platino se le hará el descuento del 25%
-El usuario introduce el precio primero y después el cupón
-El programa debe mostrar el precio original y el precio con el descuento aplicado
-También debe mostrar el mensaje "El cupón no es válido" en caso de que sea un 
 cupón equivocado
 */
let precio = Number(prompt("escribir el precio"));
let cupon = prompt("escribir el cupon");
let descuento = 0;

switch (cupon) {
  case "bronce":
    descuento = 0.05;
    resultado = precio - precio * descuento;
    document.write("precio original el proucto: " + precio);
    document.write("precio con el 5% aplicado " + resultado);

    break;
  case "plata":
    descuento = 0.1;
    resultado = precio - precio * descuento;
    document.write("precio original el proucto: " + precio);
    document.write("precio con el 10% aplicado " + resultado);

    break;
  case "oro":
    descuento = 0.2;
    resultado = precio - precio * descuento;
    document.write("precio original el proucto: " + precio);
    document.write("precio con el 20% aplicado " + resultado);

    break;
  case "platino":
    descuento = 0.25;
    resultado = precio - precio * descuento;
    document.write("precio original el proucto: " + precio);
    document.write("precio con el 25% aplicado " + resultado);

    break;
}

let nombre="nombre";
console.log("hola soy "+ nombre);
console.log("hola");
console.log('hola yo soy ${nombre} y mi edad es ${2022-1991}');

//operador ternario
//if simplificado
//condicion ? en caso de ser verdad : en caso de ser falso

let edad=24;
let mensaje=edad>=18
? "es mayor de edadd"
:"tas chiquito"; console.log(mensaje);

console.log('yo soy raul y soy ${edad}>=18? "soy mayor de eddad" :"soy menor e edad"}');

let num=2;
if (num%2==0) console.log(`${num} es par`)
(num%2 ==0)? console.log(`${num} es`):console.log(`${num} es`);