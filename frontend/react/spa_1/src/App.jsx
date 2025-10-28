import React from 'react'
import { Login } from './components/Login'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Dashboard from './components/Dashboard'
import Error from './components/Error'
import Users from './components/Users'
import Products from './components/Products'
import { EditProduct } from './components/EditProduct'
const App = () => {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Login />}></Route>
          <Route path='/error' element={<Error/>}></Route>
          <Route path='/dashboard' element={<Dashboard/>}>
               <Route path='/dashboard/users' element={<Users/>}></Route>
               <Route path='/dashboard/products' element={<Products/>}></Route>
          </Route>

          {/* path parameters */}
          {/* <Route path='/dashboard/products/edit/:id' element={<EditProduct/>}></Route> */}
          {/* query parameters */}
          <Route path='/dashboard/products/edit' element={<EditProduct/>}></Route>


        </Routes>
      </BrowserRouter>

    </>
  )
}
export default App