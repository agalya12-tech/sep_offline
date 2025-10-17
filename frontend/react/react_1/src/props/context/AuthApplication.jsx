
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
export default LoginPage