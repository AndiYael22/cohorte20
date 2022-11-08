/* pedir la hora por promt
evaluar la hora y responder
Buenos dias 6 - 11
Buenas tardes 12 - 18
Buenas noches 19 - 23
Dejame dormir 0 - 5
 */
let hora=Number(prompt("escribe la hora"  ));
if(hora>=6 && hora<=11) {
    document.write("buenos dias");    
 }else if(hora>=12 && hora<=18) {
     document.write("buenas tardes");    
  }else if(hora>=19 && hora<=23) {
     document.write("buenas noches");    
  } else if(hora>=0 && hora<=5) {
     document.write("dejame dormir");    
    } else if(hora===24) {
        document.write("es un nuevo dia");    
     
  }else{
     document.write("error la hora no es valida");    
 }