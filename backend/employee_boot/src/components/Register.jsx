import React, { useRef } from 'react'

const Register = () => {
    let nameRef = useRef()
    let emailRef = useRef()
    let phoneRef = useRef()
    let deptRef = useRef()
  return (
   <>
    <div className="container">
      <h2>Register Form</h2>
          <label htmlFor="name">Name:</label>
          <input type="text" id="name" ref={nameRef} /> 
         <br />
          <label htmlFor="email">Email:</label>
          <input type="email" id="email" ref={emailRef} />
        <br />
          <label htmlFor="phone">Phone:</label>
          <input type="tel" id="phone" ref={phoneRef} />
         <br />
          <label htmlFor="dept">Department:</label>
          <input type="text" id="dept" ref={deptRef} />
         <br />
        <button  className="btn btn-primary">Register</button>
    </div>

   </>
  )
}

export default Register