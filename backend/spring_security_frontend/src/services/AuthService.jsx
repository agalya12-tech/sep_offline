import axios from "axios";
const API="http://localhost:8080/auth";

 export const registerUser=async(user)=>{
    let res=await  axios.post(`${API}/register`,user);
    return res;
}
