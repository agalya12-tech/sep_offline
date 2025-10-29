import React from 'react'
import useFetchData from './useFetchData'

const CustomHook = () => {
    let users= useFetchData('https://fakestoreapi.com/users');
    console.log(users);
    let products= useFetchData('https://fakestoreapi.com/products');
    console.log(products);
    

    
    // function fetchUser() {
    //     console.log("-----users-------");
    //     fetch('https://fakestoreapi.com/users')
    //         .then(response => response.json())
    //         .then(data => console.log(data));
    // }
    // function fetchProduct() {
    //     console.log("----products------");
    //     fetch('https://fakestoreapi.com/products')
    //         .then(response => response.json())
    //         .then(data => console.log(data));
    // }
    // fetchProduct();
    // fetchUser();


    return (
        <div>CustomHook</div>
    )
}

export default CustomHook