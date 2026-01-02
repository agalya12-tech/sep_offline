import React from 'react'
import { Link, useNavigate } from 'react-router-dom';
import { registerUser } from '../services/AuthService';

const Register = () => {
  let nameRef = React.useRef();
  let emailRef = React.useRef();
  let passwordRef = React.useRef();
  let phoneRef = React.useRef();
  let roleRef = React.useRef();
  let navigate = useNavigate();
  let handleSubmit = (e) => {
    e.preventDefault();
    let user = {
      name: nameRef.current.value,
      email: emailRef.current.value,
      password: passwordRef.current.value,
      phone: phoneRef.current.value,
      role: roleRef.current.value
    }

    registerUser(user)
      .then((res) => {
        if (res.status === 201) {
          alert("Registration Successful");
          navigate('/login');
        }
      })
      .catch((err) => {
        console.log(err);
        alert("Registration Failed");
      });
  }

  let handleOauth = (provider) => {
    window.location.href = `http://localhost:8080/oauth2/authorization/${provider}`;
  }
  return (
    <>

      <h3>Register Account with </h3>
      <button onClick={() => { handleOauth('google') }}>Google</button>
      <button onClick={() => { handleOauth('github') }}>Github</button>


      <h1>Register Component</h1>
      <input type="text" placeholder='name' ref={nameRef} /> <br /><br />
      <input type="email" placeholder='email' ref={emailRef} /> <br /><br />
      <input type="password" placeholder='password' ref={passwordRef} /> <br /><br />
      <input type="text" placeholder='phone' ref={phoneRef} /> <br /><br />
      <select ref={roleRef}>
        <option value="STUDENT">STUDENT</option>
        <option value="ADMIN">ADMIN</option>
      </select> <br /><br />
      <p>Already have an account <Link to="/login">Login</Link></p>
      <button className='btn btn-outline-success' onClick={handleSubmit}>Register</button>



    </>

  )
}

export default Register