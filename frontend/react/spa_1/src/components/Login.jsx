import React, { useRef } from 'react'
import '../App.css'
import '../index.css'
import { useNavigate } from 'react-router-dom'
export const Login = () => {
    let email = useRef(null);
    let password = useRef(null);
    let navigate = useNavigate();
    function handleSubmit() {
        let userEmail = email.current.value;
        let userPassword = password.current.value;
        if (userEmail == "admin@gmail.com" && userPassword == "1234") {
            alert("Login Successful");
            navigate('/dashboard');
        } else {
            alert("Login Failed");
            navigate('/error')
        }
    }
    return (
        <>
            <input type="text" placeholder='enter email' ref={email} /> <br /><br />
            <input type="password" placeholder='enter password' ref={password} /> <br /><br />
            <button onClick={handleSubmit} className='btn btn-outline-primary'>Login</button>
        </>
    )
}
