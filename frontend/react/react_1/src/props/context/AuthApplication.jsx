
import React, { useContext } from 'react'
import { LoginContext } from './LoginContext'
const LoginPage = () => {
    let obj = {
        userName: "ramu@gmail.com",
        password: "ram123"
    }
    return (
        <>
            <div>LoginPage</div>
            <LoginContext.Provider value={obj}>
                <Dashboard />
            </LoginContext.Provider>

        </>
    )
}
const Dashboard = () => {
    return (
        <>
            <div>Dashboard</div>
            <Navbar />
        </>
    )
}
const Navbar = () => {
    return (
        <>
            <div>Navbar</div>
            <Profile />
            <Edit />
            <Delete />
        </>
    )
}
const Edit = () => {
    return (
        <span className='btn btn-outline-warning'>Edit</span>
    )
}
const Delete = () => {
    const { userName } = useContext(LoginContext);
    console.log(userName);
    function handleDelete() {
        alert(`User ${userName} your account is deleted`);
    }
    return (
        <span className='btn btn-outline-danger' onClick={handleDelete}>Delete</span>
    )
}
const Profile = () => {
    return (
        <span className='btn btn-outline-primary'>Profile</span>
    )
}

export default LoginPage