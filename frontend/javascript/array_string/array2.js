//   0   1   2   3   4 -----5
let arr = [101, 102, 103, 104, 105];

//  map will process/manipulate each element
let arr2 = arr.map((element) => {
  return element + 100;
});
console.log("before",arr);
console.log("after",arr2);
