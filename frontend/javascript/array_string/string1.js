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


let str6="java";
console.log(str6.padEnd(10,"*"));//java*****
console.log(str6.padEnd(10,"script"));//javascript
console.log(str6.padStart(10,"*"));//*****java


let str7="java";
console.log(str7.replace('java','python'));//python
console.log(str7.replace('j','m'));

console.log(str7.repeat(5));


let str8="hello world";
console.log(str8.startsWith('h'));//true
console.log(str8.startsWith('e'));//false
console.log(str8.endsWith('ld'));//true

let str9="hello  ";
console.log(str9.length);
let res=str9.trim(); // to remove white space trim() ,trimStart(),trimEnd()
console.log(res.length);
          
let str10="welcome";
console.log(str10.slice(0,3));//wel
console.log(str10.slice(0));//welcome
console.log(str10.slice(0,str10.length-1));//welcom

console.log(str10.substring(0,3));//wel



// printing vowels  in a string
for(let i=0;i<str10.length;i++){
   if("aeiou".indexOf(str10[i])!=-1){
    console.log(str10[i]+" is a vowel");
   }
}











let arr2=[1,2,3,4,5]
let arr3=[6,7,8,9,10]
console.log(arr2.concat(arr3));

let arr4=[...arr2,...arr3];
console.log(arr4);

console.log(arr2.slice(1,4));//[2,3,4]


