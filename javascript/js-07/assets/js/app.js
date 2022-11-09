const titulo = document.getElementById("titulo");
const parrafos=document.getElementsByClassName("parrafo");
titulo.textContent="hola";
parrafos[0].innerHTML="soy un parrafo";
console.log(titulo.textContent);
console.log(parrafos[1].textContent);
/*  parrafos[1].style.color="red";
 parrafos[1].style.backgroundColor="aqua"; */
console.log("aihsoiahnsiuas");

parrafos[1].classList.add("coloresFeos");
console.log();



//crearElementos html
const padre=document.getElementById("padre");
const enlace=document.createElement("a");
enlace.href="https://www.google.com";
enlace.textContent="google";

/* document.body.appendChild(enlace); 
document.body.insertAdjacentElement("afterend", enlace);*/

padre.appendChild(enlace)
console.log(document.body);



