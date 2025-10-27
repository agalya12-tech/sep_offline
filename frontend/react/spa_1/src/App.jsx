import React from 'react'
import { Login } from './components/Login'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Dashboard from './components/Dashboard'
import Error from './components/Error'
const App = () => {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Login />}></Route>
          <Route path='/dashboard' element={<Dashboard/>}></Route>
          <Route path='/error' element={<Error/>}></Route>
        </Routes>
      </BrowserRouter>

    </>
  )
}
export default App