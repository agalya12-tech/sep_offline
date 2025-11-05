import React, { useEffect, useRef, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import { getUser, updateUser, uploadImage } from '../services/api';

const Edit = () => {
    const { id } = useParams();
    const [user, setUser] = useState({});
    const navigate = useNavigate();
    useEffect(() => {
        getUser(id)
            .then(res => {
                setUser(res.data.data)
            })
            .catch(err => console.log(err));
    })


    const name = useRef();
    const email = useRef();
    const password = useRef();
    const address = useRef();
    const age = useRef();
    const gender = useRef();
    function handleEdit(e) {
        e.preventDefault();
        let user = {
            name: name.current.value,
            email: email.current.value,
            password: password.current.value,
            address: address.current.value,
            age: age.current.value,
            gender: gender.current.value
        }
        updateUser(id, user)
            .then(res => {
                if (res.status == 200) {
                    alert("User Updated Successfully");
                    navigate("/dashboard");
                }
            })
            .catch(err => console.log(err));

    }




    const [image, setImage] = useState(null);
    function handleEditImage(e) {
        e.preventDefault();
        
        uploadImage(image)
            .then(
                (data) => {
                    let user = {
                        image: data.data.url
                    }
                    return updateUser(id, user);
                }).then(
                    (data) => {
                        if (data.status == 200) {
                            alert('image updated  successfully')
                        }
                    }).catch(
                        (error) => {
                            console.log(error);

                        })

    }

    return (
        <>

            <img src={user.image} alt="" style={{ width: '200px', height: '200px' }} />
            <input type="file" onChange={(e) => setImage(e.target.files[0])} /><br></br>
            <button onClick={handleEditImage}>UPDATE IMAGE</button><br /><br />


            <label htmlFor="name">Name : </label>
            <input type="text" id='name' defaultValue={user.name} ref={name} /> <br /><br />
            <label htmlFor="email">Email : </label>
            <input type="email" id='email' defaultValue={user.email} ref={email} /> <br /><br />
            <label htmlFor="password">Password : </label>
            <input type="password" id='password' defaultValue={user.password} ref={password} /> <br /><br />
            <label htmlFor="address">Address : </label>
            <input type="text" id='address' defaultValue={user.address} ref={address} /> <br /><br />
            <label htmlFor="age">Age : </label>
            <input type="number" id='age' defaultValue={user.age} ref={age} /> <br /><br />
            <label htmlFor="gender">Gender : </label>
            <input type="text" id='gender' defaultValue={user.gender} ref={gender} /> <br /><br />

            <button onClick={handleEdit}>Update</button>

        </>
    )
}

export default Edit