import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useLocation, useParams, useSearchParams } from 'react-router-dom'

export const EditProduct = () => {

  
  //   let {id}=  useParams(); -- path parameter
  
  let [id] = useSearchParams(); // query parameter
  let pid = id.get('id');
  
  
  //  let location=useLocation();
  //  console.log(location);
  
  let [product,setProduct]=useState({});
  useEffect(() => {
    // fetch(`https://fakestoreapi.com/products/${pid}`)
    //   .then(response => response.json())
    //   .then(data => console.log(data));
    axios.get(`https://fakestoreapi.com/products/${pid}`)
      .then(response => {
        console.log(response.data)
        setProduct(response.data);
      });
  }, []);






  return (
    // <div>EditProduct {id}</div> -- path parameter
    // <div>EditProduct {pid}</div> //query parameter


    <>
      <label htmlFor="id">ID :  </label>
      <input type="text" id='id' value={product.id} /> <br /><br />
    
      <label htmlFor="title">Title :  </label>
      <input type="text" id='title' value={product.title} /> <br /><br />
    
      <label htmlFor="desc">Description :  </label>
      <input type="text" id='desc' value={product.description} /> <br /><br />
    
      <label htmlFor="category">Category :  </label>
      <input type="text" id='category' value={product.category} /> <br /><br />
    
      <label htmlFor="price">Price :  </label>
      <input type="text" id='price' value={product.price} /> <br /><br />
    
       <button className='btn btn-warning '>Update</button>
     
    </>
  )
}
