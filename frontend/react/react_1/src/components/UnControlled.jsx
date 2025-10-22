import React from 'react'

const UnControlled = () => {
    let name = React.useRef(null);
    let email = React.useRef(null);
    function handleSubmit(){
        console.log("Entered name is : " + name.current.value);
        console.log("Entered email is : " + email.current.value);
    }
  return (
   <>
   <input type="text" placeholder='enter name' ref={name} /><br /><br />
   <input type="text" placeholder='enter email' ref={email} /><br /><br />
   <button onClick={handleSubmit}>Submit</button>
   </>
  )  
}

export default UnControlled 

