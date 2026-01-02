import React from 'react'
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import Register from './components/Register';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Login from './components/Login';
import AdminDashboard from './components/AdminDashboard';
import StudentDashboard from './components/StudentDashboard';
import OAuthSuccess from './services/OAuthSuccess';
const App = () => {
  return (
   <BrowserRouter>
      <Routes>
        <Route path="/" element={<Register />}></Route>
        <Route path="/login" element={<Login />}></Route>
        <Route path="/admin" element={<AdminDashboard />}></Route>
        <Route path="/student" element={<StudentDashboard />}></Route>
        <Route path="/oauth-success" element={<OAuthSuccess />}></Route>
      </Routes>
   </BrowserRouter>
  )
}

export default App