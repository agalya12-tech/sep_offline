import React from 'react'
import axios from 'axios';
const Users = () => {

  function fetchUsers() {
    // fetch('https://fakestoreapi.com/users')
    //   .then(response => response.json())
    //   .then(data => console.log(data));

   
      axios.get('https://fakestoreapi.com/users')
      .then(response => console.log(response.data));
  }
  fetchUsers();

  return (

    <div>Users</div>
  )
}

export default Users