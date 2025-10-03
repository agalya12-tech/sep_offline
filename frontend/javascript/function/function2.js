//------function declaration or named function or general function

operation1(); // function declaration can be hoisted
function operation1() {
  console.log(
    "operation1 - function declaration or named function or general function"
  );
}
operation1();

// ---------function expression or anonymous function
// operation2();
let operation2 = function () {
  console.log("operation2 - function expression or anonymous function");
};
operation2();

//  -----arrow function or anonymous function
// operation3();
let operation3 = () => {
  console.log("operation3 - arrow function or anonymous function");
};
operation3();

// --- IIFE - immediately invoked function expression
(function operation4() {
    console.log("operation4 - IIFE - immediately invoked function expression");
    
})();


//  ---call back function
let userName="admin";
let password="admin@123";
function authenticate(para1,para2,para3,para4){
    if(para1==='admin'&&para2==='admin@123'){
        para3();
    }else{
        para4();
    }

}
function isSucess(){
    console.log('authentication is successful');
    console.log('forwarding to home page \n1. dashboard \n2. profile \n3. settings'); 
}
function isFailure(){
    console.log('authentication is failed .enter correct credentials 😡😡');
    
}
authenticate(userName,password,isSucess,isFailure);


// ----higher order functions
function add(a,b){
    return a+b;
}
function sub(a,b){
    return a-b;
}
function mul(a,b){
    return a*b;
}
function div(a,b){
    return a/b;
}
 


//  operation function taking another function as arguments 
//  and returning function as a result
function operations(num1,num2,task){
  return task(num1,num2);
}
let sum=operations(10,20,add);
console.log(sum);
let minus=operations(10,20,sub);
console.log(minus);
let multiplication=operations(10,20,mul);
console.log(multiplication);



//  constructor function - represents a real world entity
function Person(name,age,phone){
    this.name1=name;
    this.age1=age;
    this.phone1=phone;
}
let p1=new Person('raj',34,1234567890);
console.log(p1);

//generator function
function* generator(){
    yield 1;
    yield 2;
    yield 3;
    yield 4;
}
let gen=generator();
console.log(gen);
console.log(gen.next().value); //1
console.log(gen.next());//[value: 2, done: false]
console.log(gen.next());//[value: 3, done: false]
console.log(gen.next());//[value: 4, done: false]
console.log(gen.next());//[value: undefined, done: true]



function* idGenerator(){
   let id=1;
   while(id<=50){
    yield "ExcelR "+id;
    id++;
   }
}
let id=idGenerator();
for (let i=1;i<=50;i++){ 
    console.log(id.next().value);
  
}
