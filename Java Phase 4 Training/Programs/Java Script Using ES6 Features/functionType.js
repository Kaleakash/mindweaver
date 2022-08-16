// Normal style function declaration 
display1();
function display1() {
    document.write("<br/> Normal Style function declaration")
}

display1();
// Expression style function declaration 
let display3 = function display2() {
    document.write("<br/> Expression style function with body")
}
display3();
// Expression style function declaration 
//display4();
let display4 = function() {
    document.write("<br/> Expression style function without name")
}
display4();
// Arrow function 
let display5 = ()=>document.write("<br/>This is arrow function");
display5();

// Expression style function with parameter 

let addNumber1 = function(a,b){
    var sum = a+b;
    return sum;
}
document.write("<br> Sum of two number using expression style "+addNumber1(100,200))
// Arrow style function with parameter , it return value by default without return keyword. 
let addNumber2 = (a,b)=>a+b;
document.write("<br/> Sum of two number is "+addNumber2(100,200));

// arrow function with more than one statement we have to return mandatory with return keyword. 
let findLargest= (a,b)=> {
    if(a>b){
        return "a is largest"
    }else {
        return "b is largest"
    }
}
document.write("<br/> Find largest "+findLargest(10,5));

function greeting(fname,callback) {
    return "Welcome "+callback(fname);
}

let maleInfo = function(fname){
    return "Mr "+fname;
}
let femaleInfo = (fname)=>"Miss "+fname;

document.write("<br/>")
document.write(greeting("Raj",maleInfo));
document.write("<br/>")
document.write(greeting("Seeta",femaleInfo));
document.write("<br/>")
document.write(greeting("Ajay",function(fname){
    return "Mr "+fname;
}));
document.write("<br/>")
document.write(greeting("Leeta",(fname)=>"Miss "+fname));
