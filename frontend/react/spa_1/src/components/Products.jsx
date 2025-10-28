import axios from 'axios';
import React, { useEffect } from 'react'
import './Product.css'
const Products = () => {
let[products,setProducts]=React.useState([]);
  useEffect(
    () => {
      axios.get('https://fakestoreapi.com/products')
      .then(response => {
        console.log(response.data);
        setProducts(response.data)});
    },[]
  )




  function handleDelete(id){
    // fetch(`https://fakestoreapi.com/products/${id}`,{
    //   method:'DELETE'
    // })
    axios.delete(`https://fakestoreapi.com/products/${id}`)
    .then(res=>{
      if(res.status==200){
        alert("Deleted Successfully"+res.data.title);
        window.location.reload();
      }
    });
  }
 



  return (
     <div className='container'>
      {
        products.map((product)=><div key={product.id} className='item'>
           <img src={product.image} alt="" />
          <div>NAME: <b>{product.title.slice(0,20)}</b> </div>
          <div>DESCRIPTION: <b>{product.description.slice(0,50)}</b></div>
          <span>PRICE: <b>{product.price}</b></span>
          <span>RATING: <b>{product.rating.rate}</b></span>
          <br />
          <button className='btn btn-outline-warning'>EDIT</button>
          <button className='btn btn-outline-danger'  onClick={()=>handleDelete(product.id)} >DELETE</button>
        </div>)
      }
     </div>
  )}
export default Products