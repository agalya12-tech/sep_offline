//  id
let h1=document.getElementById('h1');
h1.innerHTML='Hello World';

//  class
let div =document.getElementsByClassName('div2');
for(let i=0;i<div.length;i++){
div[i].innerHTML='div element '+i;
div[i].style.color='red';
}

//  tagName
let p=document.getElementsByTagName('p');
p[0].innerHTML='<b>Hello World</b>';
p[0].style.color='red';

//  selector - first match
let selector=document.querySelector('.div2');
selector.style.backgroundColor='green';

//selector - all matches
let selectorAll =document.querySelectorAll('.div2');
for(let i=0;i<selectorAll.length;i++){
  selectorAll[i].style.border='1px solid red';
}