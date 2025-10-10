function fetchData(){
  fetch('https://fakestoreapi.com/products')
  .then(response => response.json())
  .then(data => {
    let body=document.querySelector('body');
     for(let i=0;i<data.length;i++){
        console.log(data[i]);
        let h2=document.createElement('h2');
        h2.innerHTML=data[i].title;
        body.appendChild(h2);

        let img=document.createElement('img');
        img.setAttribute('src',data[i].image);
        img.setAttribute('width','200px');
        img.setAttribute('height','200px');
        img.style.margin='40px';
        body.appendChild(img);
     }
  });
}
fetchData();