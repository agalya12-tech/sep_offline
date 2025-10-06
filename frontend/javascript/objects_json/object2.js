let product = {
  id: 2,
  title: "Eyeshadow Palette with Mirror",
  rating: 2.86,
  stock: 34,
  tags: ["beauty", "eyeshadow"],
  brand: "Glamour Beauty",
  sku: "BEA-GLA-EYE-002",
  weight: 9,
  dimensions: {
    width: 9.26,
    height: 22.47,
    depth: 27.67,
  },
  thumbnail:
    "https://cdn.dummyjson.com/product-images/beauty/eyeshadow-palette-with-mirror/thumbnail.webp",
};

//  accessing object values
//  print  title
console.log(product.title);
// print dimensions value
console.log(product.dimensions.height);

let keys = Object.keys(product); // for keys - array
console.log(keys);
let values = Object.values(product); // for values - array
console.log(values);
let entries = Object.entries(product); // for key-value pair(entries) -array
console.log(entries);

// manipulation
product.title = "Black EyeShadow";
console.log(product["title"]);

console.log(product);

//  creating a new object using prototype from old object
let newProduct = Object.create(product);
console.log(newProduct);
console.log(newProduct.title);

let person = {
  name: "raj",
  age: 34,
  phone: 1234567890,
  details: function () {
    console.log("The person name is ", this.name, " and age is ", this.age);
  },
};
person.__proto__.gender = "male";
console.log(person);




let newPerson = Object.create(person);
console.log(newPerson);
console.log(newPerson.name);
newPerson.details();
