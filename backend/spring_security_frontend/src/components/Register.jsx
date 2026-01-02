import React from 'react'

const Register = () => {
    let nameRef=React.useRef();
    let emailRef=React.useRef();
    let passwordRef=React.useRef();
    let phoneRef=React.useRef();
    let roleRef=React.useRef();
  let handleSubmit=()=>{
    let user={
        name:nameRef.current.value,
        email:emailRef.current.value,
        password:passwordRef.current.value,
        phone:phoneRef.current.value,
        role:roleRef.current.value
    }
    console.log(user);
  }
  
  return (
    <>
      <h1>Register Component</h1>
      <input type="text" placeholder='name' ref={nameRef} /> <br /><br />
      <input type="email" placeholder='email' ref={emailRef} /> <br /><br />
      <input type="password" placeholder='password' ref={passwordRef} /> <br /><br />
      <input type="text" placeholder='phone' ref={phoneRef} /> <br /><br />
      <select ref={roleRef}>
        <option value="STUDENT">STUDENT</option>
        <option value="ADMIN">ADMIN</option>
      </select> <br /><br />
      <button onClick={handleSubmit}>Register</button>
    </>

  )
}

export default Register