let arr = [10, 20, 30, 40, 50]; //array literal
console.log(arr);
console.log(arr[2]); //30
console.log(arr[5]); //undefined
console.log(arr[-2]); //30
console.log("size of an array", arr.length); //5

//arrays are mutable can be changed
let arr2 = [10, "A", "hello", true, { name: "raj" }]; //can store different values
console.log(arr2.length); //5
console.log(arr2); //[10, 'A', 'hello', true, { name: 'raj' }]
arr2[2] = "bye";
arr2[6] = "welcome";
console.log(arr2.length); //7
console.log(arr2); //[10, 'A', 'bye', true, { name: 'raj' },<empty>, 'welcome']

let arr3 = [101, 102, 103, 104, 105, 106, 107, 108, 109, 110];

let size = 0;
while (size < arr3.length) {
  document.write(arr3[size] + ",");
  size++;
}

document.write("<br><br>");

for (let index = 0; index < arr3.length; index++) {
  document.write(arr3[index] + ",");
}

document.write("<br><br>");
//  index position
for (const index in arr) {
 document.write(index+" - "+arr[index]+"<br>");
}

document.write("<br><br>");
//  elements
for (const element of arr) {
 document.write(element+"<br>");
}





//creating an array
let arr4=[10,20,30]; //array literal
console.log(arr4);

let arr5=new Array(10,20,30,40,50);// array constructor
console.log(arr5);//[10, 20, 30, 40, 50]

let arr6=new Array(10); // considering it as a size
console.log(arr6);//[10 empty]

let arr7 =Array.from(arr5);
console.log(arr7);//[10, 20, 30, 40, 50]

let arr8=Array.of(10); // considering it as an element
console.log(arr8);//[10]
       


