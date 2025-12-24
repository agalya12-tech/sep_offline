import React, { useEffect } from 'react'
import { fetchAllEmployees } from '../services/api';
const Dashboard = () => {
  useEffect(() => {
    fetchAllEmployees()
    .then((res) => {
      console.log("Employees fetched:", res.data);
    })
    .catch((err) => {
      console.error("Error fetching employees:", err);
    });
  }, []);
  return (
    <div>Dashboard</div>
  )
}

export default Dashboard