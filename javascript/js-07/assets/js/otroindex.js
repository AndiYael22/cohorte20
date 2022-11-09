//forma 1

//1 llamar al contenedor

const imagen=document.getElementsByClassName("contenedor")[0];

//2 crar el elemnto
const nuevIMG=document.createElement("img");
//3 modificar atributos
nuevIMG.src="https://placeimg.com/640/480/any";
nuevIMG.alt="imagen de algo";

//4- insertar el elementoi
imagen.appendChild(nuevIMG);

//otra forma

const img2=document.getElementById("imagen");

//2
img2.innerHTML=`  <img src="https://placeimg.com/640/480/any" alt="imagen de animale"/>`;

const nombres = ["Pedro", "Juan", "Sonia", "Miguel"];


const lista1=document.getElementById("lista1");
nombres.forEach((el) => {
    const li= document.createElement("li");
    li.textContent=el;
    lista1.appendChild(li);
});

const frutas=["manzana", "limon", "pera", "uva"];
const lista2=document.getElementById("lista2");

frutas.forEach((el) => {
    lista2.innerHTML+=`
    <li>${el}</li>
    `
});

