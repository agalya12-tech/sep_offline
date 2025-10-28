import React from 'react'
import { useParams, useSearchParams } from 'react-router-dom'

export const EditProduct = () => {
    //   let {id}=  useParams(); -- path parameter

       let [id]=useSearchParams(); // query parameter
       let pid=id.get('id');
       
      
  return (
    // <div>EditProduct {id}</div> -- path parameter
    <div>EditProduct {pid}</div> //query parameter
  )
}
