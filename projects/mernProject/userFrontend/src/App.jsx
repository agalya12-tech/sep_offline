import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Register from './components/Register';
import Login from './components/Login';
import './App.css'
import Dashboard from './components/Dashboard';
const App = () => {
  return (
    <>
      <BrowserRouter>
        <Routes>
         <Route path="/" element={<Register />}></Route>
         <Route path="/login" element={<Login />}></Route>
         <Route path="/dashboard" element={<Dashboard />}></Route>
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App