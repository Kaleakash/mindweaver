// let num1 = [];  // literal style memory creation 

// let num2 = new Array();     // created memory using new keyboard. 

// document.write("size of the array "+num1.length);
// document.write("<br/>size of the array "+num2.length);
// num1.push(100);
// num1.push(200);
// num1.push(300);     // added the element at last 
// num1.unshift(10);
// num1.unshift(20);
// num1.unshift(30);       // added the element at begining 
// document.write("<br/> All element are "+num1);
// num1.pop();     // it will remove element from last 
// num1.shift();   // it will remove elements from begining 
// document.write("<br/> All element are "+num1);
// // 1st parameter index position , 2nd number number of element to delete from that position 
// //num1.splice(2,1);       // 2nd index position element delete
// //num1.splice(2,2);       // from 2nd index position delete 2 element  
// num1.splice(2,0,111);   // move to 2nd index position don't delete any element and add 111 on that position 
// document.write("<br/> All element are "+num1);

let num1=[100,200,300,400,500];
// document.write("Retrieve element one by one using for loop<br/>")
// for(let i=0;i<num1.length;i++){
//     document.write("<br/> Value of i is "+num1[i]);
// }
// document.write("<br/> Retrieve the element using for of loop")
// for(let n of num1){
//     document.write("<br/> Value of n is "+n);
// }
// document.write("<br/> Retrieve the element using in loop")
// for(let i in num1){
//     document.write("<br/> Index position "+i+" Value is "+num1[i]);
// }

num1.forEach(display)

//1st way using forEach 
function display(n){
    document.write("<br/> Value is "+n);
}

//2nd way 
num1.forEach(function(n){
    document.write("<br/> Value is "+n)
});

//3rd way 
num1.forEach(n=>document.write("<br/> VAlue is "+n));






