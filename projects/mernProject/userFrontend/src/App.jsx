import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Register from './components/Register';
import Login from './components/Login';
import './App.css'
const App = () => {
  return (
    <>
      <BrowserRouter>
        <Routes>
         <Route path="/" element={<Register />}></Route>
         <Route path="/login" element={<Login />}></Route>
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App