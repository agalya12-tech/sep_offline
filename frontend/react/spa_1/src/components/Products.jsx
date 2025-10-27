import React from 'react'

const Products = () => {

  function fetchProducts(){
     fetch('https://fakestoreapi.com/products')
  }


  return (
    <div>Products</div>
  )
}

export default Products