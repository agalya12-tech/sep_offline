import React from 'react'

const Controlled = () => { 
    let[data,setData]=React.useState("");
    let[msg,setMsg]=React.useState("");
    function collectData(event){
        setData(event.target.value);
    }
  return (
   <>
   <input type="text" onChange={collectData} placeholder='enter password' />
   <p style={{color:'red'}}>{msg}</p>
   </>
  )
} 

export default Controlled 