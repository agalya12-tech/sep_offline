import React, { useRef } from 'react'
import { employeeRegister } from '../services/api'

const Register = () => {
    let nameRef = useRef()
    let emailRef = useRef()
    let phoneRef = useRef()
    let deptRef = useRef()
    let [msg,setMsg]=React.useState("")
    function handleRegister(e) {
        e.preventDefault();
       let empData={
            id:0,
            name: nameRef.current.value,
            email: emailRef.current.value,
            phone: phoneRef.current.value,
            dept: deptRef.current.value
       }
        employeeRegister(empData)
        .then((res)=>{
            console.log(res)
            alert('Employee Registered Successfully')
        })
        .catch((err)=>{
            alert('Error in Employee Registration')
            if(err.status===400){
                setMsg(err.response.data||"Your data is already exist pls try with another data")
            }
        })~
    }
  

  return <>
    <>
    {msg && <div className="alert alert-danger">{msg}</div>}
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