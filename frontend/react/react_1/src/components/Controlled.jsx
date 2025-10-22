import React from 'react'

const Controlled = () => {
  let [data, setData] = React.useState("");
  let [msg,setMsg] = React.useState("weak password");
  function collectData(event){
    setData(event.target.value);
    if(data.length>=8){ 
       if('1234567890'.split('').some((num)=>data.includes(num))) {
        if('ABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('').some((cap)=>data.includes(cap))){
          if('!@#$%^&*()_+'.split('').some((sym)=>data.includes(sym))){
            setMsg("strong password");
          }else{
            setMsg("password should contain at least one special character");
          }
        }else{
          setMsg("password should contain at least one capital letter");
        }  
       }else{
        setMsg("password should contain  at least one number");
       }
    }else{
      setMsg("length should be more than 8 characters");
    }
  }
  return (
    <>
    <div>Collected Data : {data}</div>
    <input type="text"  onChange={collectData} placeholder='enter password' />
    <p style={{color:"red"}}>{msg}</p>
    </>
  )
}

export default Controlled