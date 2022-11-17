//const calculadora=require("../calculadora")
import { indexTest } from "../calculadora";
test ("test suma",()=>{

const r=indexTest.suma(1,2);
expect (r).toBe(3);
});
test.todo("resta")
test.todo("mult")
test.todo("div")