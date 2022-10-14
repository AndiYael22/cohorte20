let num1 = parseInt (prompt("valor del primer numero"));
let num2 = parseInt (prompt("valor del segundo numero"));
let num3 = parseInt (prompt("valor del tercer numero"));
console.log("el orden de los numeros es "+num1+" "+num2+" "+num3);
function mayor(){
    if(num1>=num2 && num1>=num3 &&num2>=num3){
console.log("el orden de mayor a menor es "+num1+" "+num2+" "+num3);} 
else if(num1>=num3 && num1>=num2 &&num2<=num3){
    console.log("el orden de mayor a menor es "+num1+" "+num3+" "+num2);}
else if(num2>=num1 && num2>=num3 &&num1>=num3){
    console.log("el orden de mayor a menor es "+num2+" "+num1+" "+num3);}
 else if(num2>=num3 && num2>=num1 &&num1<=num3){
    console.log("el orden de mayor a menor es "+num2+" "+num3+" "+num1);}
else if(num3>=num1 && num3>=num2 &&num1>=num2){
    console.log("el orden de mayor a menor es "+num3+" "+num1+" "+num2);} 
else if(num3>=num2 && num3>=num1 &&num1<=num2){
    console.log("el orden de mayor a menor es "+num3+" "+num2+" "+num1);}
}mayor();
function menor(){
    if(num1<=num2 && num1<=num3 &&num2<=num3){
console.log("el orden de menor a mayor es "+num1+" "+num2+" "+num3);} 
else if(num1<=num3 && num1<=num2 &&num2>=num3){
    console.log("el orden de menor a mayor es "+num1+" "+num3+" "+num2);}
else if(num2<=num1 && num2<=num3 &&num1<=num3){
    console.log("el orden de menor a mayor es "+num2+" "+num1+" "+num3);}
 else if(num2<=num3 && num2<=num1 &&num1>=num3){
    console.log("el orden de menor a mayor es "+num2+" "+num3+" "+num1);}
else if(num3<=num1 && num3<=num2 &&num1<=num2){
    console.log("el orden de menor a mayor es "+num3+" "+num1+" "+num2);}
 else if(num3<=num2 && num3<=num1 &&num1>=num2){
    console.log("el orden de menor a mayor es "+num3+" "+num2+" "+num1);}
}menor();
