import React, { useRef } from 'react'
import { save, uploadImage } from '../services/api';
import { Link, useNavigate } from 'react-router-dom';

const Register = () => {
    let navigate = useNavigate();
    const [image, setImage] = React.useState(null);
    const name = useRef();
    const email = useRef();
    const password = useRef();

    function handleSubmit(e) {
        e.preventDefault();
           uploadImage(image)
            .then(
                (data) => {
                    let user = {
                        name: name.current.value,
                        email: email.current.value,
                        password: password.current.value,
                        image: data.data.url
                    }
                    return save(user);
                }).then(
                    (data) => {
                        if (data.status == 200) {
                            alert('user registered successfully')
                            navigate("/login")
                        }
                    }).catch(
                        (error) => {
                            alert(error.response.data.MSG)
                            navigate("/")
                        })
    }
    return (
        <>
            <label htmlFor="name">Name : </label>
            <input type="text" id='name' placeholder='enter name' ref={name} /><br /><br />

            <label htmlFor="email">Email : </label>
            <input type="email" id='email' placeholder='enter email' ref={email} /><br /><br />

            <label htmlFor="password">Password : </label>
            <input type="password" id='password' placeholder='enter password' ref={password} /><br /><br />

            <input type="file" accept="image/*"
                onChange={(e) => setImage(e.target.files[0])}
            /> <br /><br />
            <p>Already have an account? <Link to="/login">Login</Link></p>
            <button onClick={handleSubmit}>REGISTER</button>
        </>
    )
}
export default Register