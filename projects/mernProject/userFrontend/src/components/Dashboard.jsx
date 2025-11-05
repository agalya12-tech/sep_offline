import React, { useEffect, useState } from 'react'
import { deleteUser, getAllUsers } from '../services/api';

const Dashboard = () => {
    const [users, setUsers] = useState([]);
    useEffect(() => {
        getAllUsers()
            .then(res => {
                setUsers(res.data.data)
            })
            .catch(err => console.log(err));
    }, []);

    function handleDelete(id) {
        deleteUser(id)
            .then(res => {
                if (res.status == 200) {
                    alert("Deleted Successfully");
                    window.location.reload(); 
                }
            })
            .catch(err => console.log(err.response.data.MSG));
    }
    return (
        <>
            <table class="table table-striped table-hover">
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Age</th>
                    <th>Gender</th>
                    <th>Address</th>
                    <th>IMAGE</th>
                    <th>EDIT</th>
                    <th>DELETE</th>
                </tr>
                {
                    users.map((user) => {
                        return (
                            <tr key={user._id} class="table-primary">
                                <td>{user.name}</td>
                                <td>{user.email}</td>
                                <td>{user.age}</td>
                                <td>{user.gender}</td>
                                <td>{user.address}</td>
                                <td><img style={{ "width": "200px", "height": "200px" }} src={user.image} alt="" /></td>
                                <td><button className='btn btn-primary'>Edit</button></td>
                                <td><button className='btn btn-danger' onClick={() => handleDelete(user._id)}>Delete</button></td>
                            </tr>
                        )
                    })
                }
            </table>
        </>
    )
}

export default Dashboard