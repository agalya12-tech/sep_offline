import React from 'react'

const Controlled = () => {
  let [data, setData] = React.useState("");
  let [msg,setMsg] = React.useState("weak password ");
  let [color,setColor] = React.useState("red");

 



  function collectData(event){
    setData(event.target.value);
    // if(data.length>=8){ 
    //    if('1234567890'.split('').some((num)=>data.includes(num))) {
    //     if('ABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('').some((cap)=>data.includes(cap))){
    //       if('!@#$%^&*()_+'.split('').some((sym)=>data.includes(sym))){
    //         setMsg("strong password");
    //         setColor("green");
    //       }else{
    //         setMsg("password should contain at least one special character");
    //         setColor("red");
    //       }
    //     }else{
    //       setMsg("password should contain at least one capital letter");
    //       setColor("red");
    //     }  
    //    }else{
    //     setMsg("password should contain  at least one number");
    //     setColor("red");
    //    }
    // }else{
    //   setMsg("length should be more than 8 characters");
    //   setColor("red");
    // }

   if(data.length>=8&& '1234567890'.split('').some((num)=>data.includes(num))&& 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('').some((cap)=>data.includes(cap))&& '!@#$%^&*()_+'.split('').some((sym)=>data.includes(sym))){
        setMsg("strong password");
        setColor("green");
  }else{
        setMsg("weak password , at least 8 characters, one number, one capital letter and one special character" );
        setColor("red");
  }

  

  }
  return (
    <>
    <div>Collected Data : {data}</div>
    <input type="text"  onChange={collectData} placeholder='enter password' />
    <p style={{color:color}}>{msg}</p>
    </>
  )
}

export default Controlled