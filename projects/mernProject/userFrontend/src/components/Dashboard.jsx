import React, { useEffect, useState } from 'react'
import { getAllUsers } from '../services/api';

const Dashboard = () => {
    const [users, setUsers] = useState([]);
    useEffect(() => {
        getAllUsers()
            .then(res => {
                console.log(res.data.data)
                setUsers(res.data.data)
            })
            .catch(err => console.log(err));
    }, []);

    return (
        <>  <table className='table table-striped'>
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
                        <tr>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                            <td>{user.age}</td>
                            <td>{user.gender}</td>
                            <td>{user.address}</td>
                            <td><img style={{"width":"200px", "height" :"200px"}} src={user.image} alt="" /></td>
                            <td><button className='btn btn-primary'>Edit</button></td>
                            <td><button className='btn btn-danger'>Delete</button></td>
                        </tr>
                    )
                })
            }
        </table>
        </>
    )
}

export default Dashboard