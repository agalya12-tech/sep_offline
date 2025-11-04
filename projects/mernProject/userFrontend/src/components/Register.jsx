import axios from 'axios';
import React from 'react'

const Register = () => {
    const [image, setImage] = React.useState(null);

     function handleSubmit(e){
        e.preventDefault();
       
        let formData= new FormData();
        formData.append('file', image);
        formData.append('upload_preset', 'mern_project');
        formData.append('cloudinary', 'dsbwkapof');
        axios.post('https://api.cloudinary.com/v1_1/dsbwkapof/image/upload', formData)
       
     }

    return (
        <>
        <input type="file" accept="image/*" 
        onChange={(e)=>setImage(e.target.files[0])}
         /> <br /><br />
        <button onClick={handleSubmit}>Upload</button>
        </>
    )
}
export default Register