f1(); // function hoisting - before creating a function,
//  we can call the function
function f1() {
  // no argumented function/non parameter function
  for (let i = 1; i <= 5; i++) {
    document.write(i + " ");
  }
  document.write("<br>");
}
f1();
// -------------------------------------------------------
function f2(value) {
  //argumented function/parameter function
  for (let i = 1; i <= 5; i++) {
    document.write(value + " ");
  }
  document.write("<br>");
}
f2("*");
f2("$");
function table(num) {
  for (let i = 1; i <= 10; i++) {
    document.write(num + " * " + i + " = " + num * i + "<br>");
  }
  document.write("<br>");
}

table(2);
table(3);
table(15);
table(19);

// -------------------------------------------------------

function isPrime(num) {
  let count = 0;
  for (let i = 1; i <= num; i++) {
    if (num % i == 0) {
      count++;
    }
  }
  return count == 2;
}
// let res=isPrime(4);
// console.log(res, typeof res);
isPrime(3)? console.log("prime"):console.log("not prime");
isPrime(4)? console.log("prime"):console.log("not prime");
