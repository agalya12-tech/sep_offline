import axios from 'axios';
import React, { useEffect } from 'react'

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


  return (
     <div className='container'>
      {
        products.map((product)=><div key={product.id} className='item'>
           <img src={product.image} alt="" />
          <div>NAME: <b>{product.title}</b> </div>
          <div>PRICE: <b>{product.price}</b></div>
          <div>DESCRIPTION: <b>{product.description}</b></div>
          <div>RATING: <b>{product.rating.rate}</b></div>
        </div>)
      }


     </div>
  )
}

export default Products