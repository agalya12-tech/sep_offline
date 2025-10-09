let str="hello";
console.log(str);
console.log(str.length);//5
console.log(str[2]);//l
console.log(str[7]);//undefined
console.log(str.charAt(0));//h


console.log(str.toUpperCase());//HELLO
let str2="HEllO";
console.log(str2.toLowerCase());//hello

let str3='Hello';
let str4='World';
console.log(str3+" "+str4);//concatenation
console.log(str3.concat(" ",str4));
console.log(`${str3} ${str4}`);//interpolation

console.log(str.includes('l'));//true
console.log(str.includes('z'));//false

let str5="hello world welcome to javascript";
let arr=str5.split(" ");
console.log(arr);

console.log(str4.split('l'));
console.log(str3.split(''));

