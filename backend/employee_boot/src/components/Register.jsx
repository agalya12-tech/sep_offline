import React, { useRef } from 'react'

const Register = () => {
    let nameRef = useRef()
    let emailRef = useRef()
    let phoneRef = useRef()
    let deptRef = useRef()
    function handleRegister(e) {
        e.preventDefault();
       let empData={
            name: nameRef.current.value,
            email: emailRef.current.value,
            phone: phoneRef.current.value,
            dept: deptRef.current.value
       }
        console.log(empData)
    }
  

  return <>
    <>
    <div className="container">
      <h2>Register Form</h2>
          <label htmlFor="name">Name:</label>
          <input type="text" id="name" ref={nameRef} /> 
         <br /> <br />
          <label htmlFor="email">Email:</label>
          <input type="email" id="email" ref={emailRef} />
        <br /> <br />
          <label htmlFor="phone">Phone:</label>
          <input type="tel" id="phone" ref={phoneRef} />
         <br /> <br />
          <label htmlFor="dept">Department:</label>
          <input type="text" id="dept" ref={deptRef} />
         <br /> <br />
        <button onClick={handleRegister} className="btn btn-primary">Register</button>
    </div>

   </>
  </>
}

export default Register