import axios from 'axios';
import React, { useRef } from 'react'
import { login, save } from '../services/api';
import { Link, useNavigate } from 'react-router-dom';

const Login = () => {
  let navigate = useNavigate();
  const email = useRef();
  const password = useRef();

  function handleSubmit(e) {
    e.preventDefault();
    let obj = {
      email: email.current.value,
      password: password.current.value
    }
    login(obj)
      .then(
        (data) => {
          if (data.status == 200) {
            alert('user login successfully')
            navigate("/dashboard")
          }
        }).catch(
          (error) => {
            alert("Invalid Credentials")
            navigate("/login")
          })
  }
  return (
    <>
      <label htmlFor="email">Email : </label>
      <input type="email" id='email' placeholder='enter email' ref={email} /><br /><br />
      <label htmlFor="password">Password : </label>
      <input type="password" id='password' placeholder='enter password' ref={password} /><br /><br />
      <p>Not Yet Registered? <Link to="/">Register</Link></p>
      <button onClick={handleSubmit}>LOGIN</button>
    </>
  )
}
export default Login