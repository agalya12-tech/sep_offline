import React from 'react'
import Register from './components/Register'
import './App.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
const App = () => {
  return (
   <BrowserRouter>
      <Routes>
        <Route path="/" element={<Register />} />
      </Routes>
    </BrowserRouter>
  )
}
export default App