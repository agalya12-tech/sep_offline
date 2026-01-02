import React from 'react'
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import Register from './components/Register';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Login from './components/Login';
const App = () => {
  return (
   <BrowserRouter>
      <Routes>
        <Route path="/" element={<Register />}></Route>
        <Route path="/login" element={<Login />}></Route>
      </Routes>
   </BrowserRouter>
  )
}

export default App