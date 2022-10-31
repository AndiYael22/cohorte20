let miNombre=" Andi Yael Blancas Vazquez";
console.log(miNombre);

function miNombre1() {
    let nombre="andi";
    console.log(nombre);
}
miNombre1();

function funcio1() {
    let valor=2;
    valor=valor+3
    return valor;
}
let resultaddo=funcio1();
console.log("el resultado es: ",resultaddo);

function funcio11() {
    let valor=2;
    valor=valor+3;
    console.log("el resultado es: ",valor);
 
}
funcio11();

let valor2=3;
function funcion2() {
    valor2=valor2+5;
    console.log("el valor es ",valor2);
    
}
funcion2();

let variableGlobal=5;
function funcion3() {
    let variableLocal="el valor es: ";
    console.log(variableLocal+variableGlobal);
}
funcion3();

function funcion4(valor) {
    let numero=6;
    numero=numero*valor;
    return numero;
    
}
let salia=funcion4(5);
console.log("el proucto es "+salia);

//funcion anonima
let miFuncion0= function (parametro){
parametro =parametro *  2;
return parametro;
}
console.log("llamando ala funcion anonima "+ miFuncion0(4));

let funcion01= function (caracteres){
    return "Hola "+ caracteres;
    }(" lunes");
    console.log("El resultado es: "+ funcion01);

    //funcion tipo flecha
    let suma=(x,y)=>{
        return x+y
        };
        let resultado=suma(5,3);
        console.log("la suma es: ", resultado);






        let preciototal= function (precio){
            precio =(precio*1.16)+10;
            return precio;
            }
            console.log("el precio total es:  "+ preciototal(23.34));
            
    let preTotal=(precio,impuesto,envio)=>{
        return (precio*impuesto)+envio;
        
        };
        let resultadoT=preTotal(23.34,1.16,10);
       console.log("la suma es: ", resultadoT);


       
       let preciototal1= function (precio, impt){
        impt=1+(impt/100)*precio;
        precio =(precio*1.16)+10;
        return precio+ " impuesto "+ impt;
        }
        console.log("el precio total es:  "+ preciototal1(23.34, 16) );
       
        
let miObjeto={
    nombre:"juan",
    edad:24
    };
    let mensaje="tu nombre es: "+ miObjeto.nombre;
    mensaje+=" tienes " + miObjeto["edad"]+" años";
    console.log(mensaje);