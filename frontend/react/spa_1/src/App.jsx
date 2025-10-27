import React from 'react'
import { Login } from './components/Login'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
const App = () => {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Login />}></Route>
        </Routes>
      </BrowserRouter>

    </>
  )
}
export default App