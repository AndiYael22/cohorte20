import React from 'react'

export const segundocomponente = () => {
  
    const libros=["harry Potter","el periquito sarniento","el hobbit","el principito"];
    return (
    <div>       
        <h1> segundocomponente  </h1> 
        <ul>{ 
          libros.forEach(libros =>{
            return <li> {libro[0]}</li>
          })
           }
          </ul>
          </div>
        
    )

 }