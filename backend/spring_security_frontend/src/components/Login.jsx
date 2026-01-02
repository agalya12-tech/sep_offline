import React from 'react'
import { Link, useNavigate } from 'react-router-dom';
import { loginUser } from '../services/AuthService';

const Login = () => {

  let emailRef = React.useRef();
  let passwordRef = React.useRef();
  let navigate = useNavigate();

   let handleSubmit = (e) => {
    e.preventDefault();
    let credentials = {
      email: emailRef.current.value,
      password: passwordRef.current.value
    }
    loginUser(credentials)
    .then((res) => {
      if (res.status === 200) {
        alert("Login Successful");
      let userData=res.data.data;
      if(userData.role==="ADMIN"){
        navigate('/admin');
      }else{
        navigate('/student');
      }
      } 
    })
    .catch((err) => {
      console.log(err);
      alert("Login Failed");
    });
  }





   let handleOauth = (provider) => {
    window.location.href = `http://localhost:8080/oauth2/authorization/${provider}`;
  }
  return (
    <>

       <h3>Login Account with </h3>
      <button onClick={() => { handleOauth('google') }}>Google</button>
      <button onClick={() => { handleOauth('github') }}>Github</button>
      <h1>Login Form</h1>

      <input type="email" placeholder='email' ref={emailRef} /> <br /><br />
      <input type="password" placeholder='password' ref={passwordRef} /> <br /><br />
  
      <p> Don't have an account <Link to="/">Register</Link></p>
      <button className='btn btn-outline-success' onClick={handleSubmit}>Login</button>

    </>
  )
}

export default Login