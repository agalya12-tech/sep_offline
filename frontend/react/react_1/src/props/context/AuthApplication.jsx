
import React from 'react'
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
    return (
        <span className='btn btn-outline-danger'>Delete</span>
    )
}
const Profile = () => {
    return (
        <span className='btn btn-outline-primary'>Profile</span>
    )
}

export default LoginPage