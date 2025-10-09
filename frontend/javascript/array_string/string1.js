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


let arr5=[101,102,103,104,105];
console.log("original",arr5); //[101,102,103,104,105]

let copied=Array.from(arr5);
console.log("copied",copied);//[101,102,103,104,105]

let res4=copied.splice(0,3,'T',"T","T");
console.log(res4);//[101,102,103]
console.log(copied);//['T', 'T', 'T', 104,105]


console.log([10,20,30,40].splice(0,2));//[10,20]
console.log([10,20,30,40].splice(0,0));//[0]


console.log(['A','B','C'].join(":"));











let input=['orange','apple','banana','mango','grapes'];
// let result=input.slice(0,3);
// console.log(result);['orange', 'apple', 'banana']
// console.log(input);['orange', 'apple', 'banana', 'mango', 'grapes']


// let result=input.splice(0,3);
// console.log(result);['orange', 'apple', 'banana']
// console.log(input);['mango', 'grapes']

// for replacing the last element

// input.pop();// removes the last element
// input.push('kiwi');// add kiwi at last
// console.log(input);

// input[input.length-1]='kiwi'; // replacing the last element
// console.log(input);

// input.splice(input.length-1,           1,                        'kiwi'); 
//           starting index   number of elements to be removed   element to be added
// console.log(input);

//replacing an element in 2nd index position
// input[2]='kiwi';
let removed=input.splice(2,1,'kiwi');
console.log(input);//['orange', 'apple', 'kiwi', 'mango', 'grapes']
console.log(removed);//['banana']

