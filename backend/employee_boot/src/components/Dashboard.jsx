import React, { useEffect } from 'react'
import { fetchAllEmployees } from '../services/api';
const Dashboard = () => {
  let[employees,setEmployees]=React.useState([])

  useEffect(() => {
    fetchAllEmployees()
    .then((res) => {
        setEmployees(res.data);
    })
    .catch((err) => {
      console.error("Error fetching employees:", err);
    });
  }, []);
  return (
   <>  
   
   <table className="table table-bordered table-striped table-hover">
    <thead>
        <tr className="table-dark">
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Department</th>
            <th>DELETE</th>
            <th>UPDATE</th>
        </tr>
    </thead>
    <tbody>
        {employees.map((emp) => (
            <tr key={emp.id}>
                <td>{emp.id}</td>
                <td>{emp.name}</td>
                <td>{emp.email}</td>
                <td>{emp.phone}</td>
                <td>{emp.dept}</td>
                <td><button className="btn btn-danger">DELETE</button></td>
                <td><button className="btn btn-warning">UPDATE</button></td>
            </tr>
        ))}
    </tbody>
   </table>
   
   </>    

   

)
}

export default Dashboard