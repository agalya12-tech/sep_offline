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



