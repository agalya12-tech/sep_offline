let fruits = ["banana", "apple", "mango", "orange", "grapes", "kiwi"];


let ul = document.querySelector("ul");
for (let i = 0; i < fruits.length; i++) {
  let li = document.createElement("li");
  li.innerHTML = fruits[i];
  ul.appendChild(li);
}
