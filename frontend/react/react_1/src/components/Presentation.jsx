import React from 'react'

const Presentation = (props) => {
    const { name, age, phone } =
     props.data;
    
  return (
    <div>
      <h2>Presentation</h2>
      <p>Name: {name}</p>
      <p>Age: {age}</p>
      <p>Phone: {phone}</p>
    </div>
  )
}

export default Presentation