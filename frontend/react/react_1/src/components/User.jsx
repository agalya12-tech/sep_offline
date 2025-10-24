import React from 'react'

const User = (props) => {
  return (
   <>
     <h1>User Component</h1>
     <p>Name: {props.name}</p>
     <p>Age: {props.age}</p>
     <p>Phone: {props.phone}</p>
   
   </>
  )
} 

export default User