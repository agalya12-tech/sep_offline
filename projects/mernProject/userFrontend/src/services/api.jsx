import axios from "axios"

const API='http://localhost:5000'

export const save=(user)=>axios.post(`${API}/save`,user);
export const login=(user)=> axios.post(`${API}/login`,user);

export const getAllUsers=()=>axios.get(`${API}/fetchAll`);
export const getUser=(id)=>axios.get(`${API}/fetchById/${id}`);

export const deleteUser=(id)=>axios.delete(`${API}/delete/${id}`);
export const updateUser=(id,user)=>axios.put(`${API}/update/${id}`,user);

export const uploadImage=(img)=>{
            let formData = new FormData();
            formData.append('file', img);
            formData.append('upload_preset', 'mern_project');
            formData.append('cloudinary', 'dsbwkapof');
  return  axios.post('https://api.cloudinary.com/v1_1/dsbwkapof/image/upload',formData)
};