/* 

const foo= () = > console.log("First");
const bar= () = > setTimeout(()=>console.log("second"),500 );
const baz= () = > console.log("Third")
*/

/* const foo= () => console.log("First");
const bar= () => setTimeout(()=>console.log("Second"),500 );
const baz= () => console.log("Third")

bar();
foo();
baz();
 */


/*   setTimeout(() => {
    return nombres;
  }, 3000); */

  /* const nombre = () => {
    const nombres = ["Pepe", "Pancho", "María"];
 */
    

    /* setTimeout(() => {
        return nombres;
    }, 0); */

   /*  return new Promise((resolve, reject) => { //resolve -- proceso exitoso
        setTimeout(() => {
                                //reject -- proceso no exitoso
           if(true){
            resolve(nombres);
           }else{
            reject("No hay nombres");
           }
           
        }, 3000)
    });

}
nombre().then(nombres => console.log(nombres)).catch(error => console.warn(error));


console.log(nombre()[0]); */
/* 

const pokedex = () => {
  fetch(url)
    .then((datos) => {return datos.json()})
    .then((pokemon) => {
      console.log(pokemon);
    });
};

pokedex(); */

const cartaPokemon= document.getElementById("pokemon");
const nombrepokemon= document.getElementById("nombre");
const imagen= document.getElementById("img");
const form= document.getElementById("form");

const pokedex= async(numero) => {
    
const url = ` https://pokeapi.co/api/v2/pokemon/${numero}` ;
try {
    const respuesta=await fetch(url);
    const pokemon=await respuesta.json();

    console.log(pokemon.name);

    const datos={
nombre:pokemon.name,
imagen:pokemon.sprites.other['official-artwork'].front_default,
    
}
 console.log(datos.imagen);
    nombrepokemon.textContent=pokemon.name;
    imagen.innerHTML=`   <img src="${datos.imagen}" alt="imagen de${datos.imagen} "> ` 
} catch (error) {
    
}


 };

 form.addEventListener("submit",(evento)=>{

evento.preventDefault();

const valor=document.getElementById("idP").value;
    console.log(valor);

    pokedex(valor);

form.reset();
} );