import React, { useEffect } from 'react'
import axios from 'axios';
const Users = () => {

    let[users,setUsers]=React.useState([]);
  useEffect(
    () => {
      axios.get('https://fakestoreapi.com/users')
      .then(response => {
        console.log(response.data);
        setUsers(response.data)});
    },[]
  )
  return (
    <>
     <div className='container text-center'>
      {
      users.map((user)=><div key={user.id} className='item'>
        <div>USERNAME: <b>{user.username}</b> </div>
        <div>EMAIL: <b>{user.email}</b></div>
        <div>PHONE: <b>{user.phone}</b></div>

      </div>)
    }
     </div>
    </>
    
  )
}

export default Users