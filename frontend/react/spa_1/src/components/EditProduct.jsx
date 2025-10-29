import axios from 'axios';
import React, { createRef, useEffect, useRef, useState } from 'react'
import { useLocation, useNavigate, useParams, useSearchParams } from 'react-router-dom'

export const EditProduct = () => {
  //   let {id}=  useParams(); -- path parameter
  let [id] = useSearchParams(); // query parameter
  let pid = id.get('id');
  //  let location=useLocation();
  //  console.log(location);

  let [product, setProduct] = useState({});
  let navigate = useNavigate();
  let title = useRef(null);
  let description = useRef(null);
  let category = useRef(null);
  let price = useRef(0);
  function handleEdit(e) {
    e.preventDefault();
    let product = {
      id: pid,
      title: title.current.value,
      description: description.current.value,
      category: category.current.value,
      price: price.current.value
    }
    console.log(product);
    fetch(`https://fakestoreapi.com/products/${pid}`, {
      method: 'PUT',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(product)
    })
      .then(response => response.json())
      .then(data => {
        alert("Product Updated Successfully");
        navigate("/dashboard/products");
      });


  }
  useEffect(() => {
    // fetch(`https://fakestoreapi.com/products/${pid}`)
    //   .then(response => response.json())
    //   .then(data => console.log(data));
    axios.get(`https://fakestoreapi.com/products/${pid}`)
      .then(response => {
        // console.log(response.data)
        setProduct(response.data);
      });
  }, [])
  return (
    // <div>EditProduct {id}</div> -- path parameter
    // <div>EditProduct {pid}</div> //query parameter


    <>
      <label htmlFor="id">ID :  </label>
      <input type="text" id='id' defaultValue={product.id} readOnly /> <br /><br />

      <label htmlFor="title">Title :  </label>
      <input type="text" id='title' defaultValue={product.title} ref={title} /> <br /><br />

      <label htmlFor="desc">Description :  </label>
      <input type="text" id='desc' defaultValue={product.description} ref={description} /> <br /><br />

      <label htmlFor="category">Category :  </label>
      <input type="text" id='category' defaultValue={product.category} ref={category} /> <br /><br />

      <label htmlFor="price">Price :  </label>
      <input type="text" id='price' defaultValue={product.price} ref={price} /> <br /><br />

      <button className='btn btn-warning ' onClick={handleEdit}>Update</button>

    </>
  )
}
