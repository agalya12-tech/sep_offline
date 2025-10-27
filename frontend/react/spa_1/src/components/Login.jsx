import React, { useRef } from 'react'
import '../App.css'
import '../index.css'
export const Login = () => {
    let email = useRef(null);
    let password = useRef(null);
    function handleSubmit() {
        let userEmail = email.current.value;
        let userPassword = password.current.value;
        if(userEmail == "admin@gmail.com" && userPassword == "1234"){
            alert("Login Successful");
        }else{
            alert("Login Failed");
        }
    }
    return (
        <>
            <input type="text" placeholder='enter email' ref={email} /> <br /><br />
            <input type="password" placeholder='enter password' ref={password} /> <br /><br />
            <button onClick={handleSubmit}>Login</button>
        </>
    )
}
