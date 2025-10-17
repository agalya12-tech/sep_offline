
import React from 'react'
const LoginPage = () => {
    let obj = {
        userName: "ramu@gmail.com",
        password: "ram123"
    }
    return (
        <>
            <div>LoginPage</div>
            <Dashboard />
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
        <div>Navbar</div>
    )
}
const Edit = () => {
    return (
        <span>Edit</span>
    )
}
const Delete = () => {
    return (
        <span>Delete</span>
    )
}
const Profile = () => {
    return (
        <span>Profile</span>
    )
}

export default LoginPage