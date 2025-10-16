import React from 'react'

const Child = ( props) => {
    let data=props.d1;    
  return (
   <div>

    <div>In Child Component</div>
    <h1>{data}</h1>
   </div>
  )
}

export default Child