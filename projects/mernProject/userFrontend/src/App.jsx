import React, { Suspense } from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Register from './components/Register';
import Login from './components/Login';
import './App.css'
// import Dashboard from './components/Dashboard';
const Dashboard = React.lazy(
  () => import('./components/Dashboard')
);

import Edit from './components/Edit';
const App = () => {
  return (
    <>
      <Suspense fallback={<h1>Loading...</h1>}>
        <BrowserRouter>
          <Routes>
            <Route path="/" element={<Register />}></Route>
            <Route path="/login" element={<Login />}></Route>
            <Route path="/dashboard" element={<Dashboard />}></Route>
            <Route path="/edit/:id" element={<Edit />}></Route>
          </Routes>
        </BrowserRouter>
      </Suspense>
    </>
  )
}

export default App