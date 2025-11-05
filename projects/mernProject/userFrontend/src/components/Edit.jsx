import React, { use, useEffect, useRef, useState } from 'react'
import { useBlocker, useParams } from 'react-router-dom'
import { getUser } from '../services/api';

const Edit = () => {
    const { id } = useParams();
    const [user, setUser] = useState({});
    
    useEffect(() => {
        getUser(id)
        .then(res => {
            console.log(res.data.data)
            setUser(res.data.data)
        })
        .catch(err => console.log(err));
    })


    const name=useRef();
    const email=useRef();
    const password=useRef();
    const address=useRef();
    const age=useRef();
    const gender=useRef();
    return (
        <>
        <label htmlFor="name">Name : </label>
        <input type="text" id='name' defaultValue={user.name}  ref={name}/> <br /><br />
        <label htmlFor="email">Email : </label>
        <input type="email" id='email' defaultValue={user.email} ref={email} /> <br /><br />
        <label htmlFor="password">Password : </label>
        <input type="password" id='password' defaultValue={user.password} ref={password} /> <br /><br />
        <label htmlFor="address">Address : </label>
        <input type="text" id='address' defaultValue={user.address} ref={address} /> <br /><br />
        <label htmlFor="age">Age : </label>
        <input type="number" id='age' defaultValue={user.age} ref={age} /> <br /><br />
        <label htmlFor="gender">Gender : </label>
        <input type="text" id='gender' defaultValue={user.gender} ref={gender} /> <br /><br />
    
        <button>Update</button>
        
        </>
    )
}

export default Edit