//   0   1   2   3   4 -----5
let arr = [101, 102, 103, 104, 105];

//  map will process/manipulate each element
let arr2 = arr.map((element) => {
  return element + 100;
});
console.log("before", arr);
console.log("after", arr2);

//filter will filter the element based on the condition
// size can be decrease
let even = arr.filter((element) => {
  return element % 2 == 0;
});
console.log("before using filter", arr);
console.log("after using filter", even);



let sum = arr.reduce((total, element) => {
  return total + element;
}, 0);
console.log(sum);//515


let fruits=["banana",'apple','mango','orange'];
fruits.push('grapes'); // add at the end
console.log(fruits);//['banana', 'apple', 'mango', 'orange', 'grapes']
fruits.pop();// remove at the end
console.log(fruits);//['banana', 'apple', 'mango', 'orange']
fruits.shift();//remove at the start
console.log(fruits);//['apple', 'mango', 'orange']
fruits.unshift('banana');//add at the start
console.log(fruits);//['banana', 'apple', 'mango', 'orange']
