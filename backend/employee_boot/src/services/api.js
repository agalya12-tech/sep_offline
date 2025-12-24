import axios from "axios";
const API = "http://localhost:8080";

export const employeeRegister = async (employeeData) => {
  let response = await axios.post(`${API}/save`, employeeData);
  return response;
};
