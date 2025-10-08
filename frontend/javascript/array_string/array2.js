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






let colors=["red","green","blue",'yellow','black','white'];
console.log(colors.reverse());
console.log(colors.sort());

console.log(colors.includes('red'));//true
console.log(colors.includes('orange'));//false

console.log(colors.indexOf('red'));//3
console.log(colors.indexOf('orange'));//-1

if("aeiou".indexOf('a')!=-1){
    console.log("vowel");
}else{
    console.log("consonant");
}


let str="hello";
console.log(str.indexOf('l'));//2
console.log(str.lastIndexOf('l'));//3


let arr3=[10,20,31,40,50];
       let every= arr3.every(
            (element,index,array)=>{
            return element%2==0
            }
        );
        console.log(every);//false 
        let some=arr3.some(
             (element)=>{
            return element%2==0
            }
        );
        console.log(some);//true
        
        
        let find= arr3.find(
            (element)=>{
              return element%2==0;
            }
        )
        console.log(find);//10
        let findLastIndex= arr3.findLastIndex(
            (element)=>{
              return element%2==0;
            }
        )
        console.log(findLastIndex);//4


