import React from 'react'

const UnControlled = () => {
    let inputRef = React.useRef(null);
    function handleSubmit(){
        console.log(inputRef);    
        console.log("Entered name is : " + inputRef.current.value);
    }
  return (
   <>
   <input type="text" placeholder='enter name' ref={inputRef} />
   <button onClick={handleSubmit}>Submit</button>
   </>
  )  
}

export default UnControlled 

