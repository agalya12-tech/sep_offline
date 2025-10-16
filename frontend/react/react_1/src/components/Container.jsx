import React from 'react'
import Presentation from './Presentation'
const Container = () => {
    let obj = {
        name: "Raj",
        age: 24,
        phone: 1234567890
    }
    return (
        <>
     <Presentation data={obj} />
        </>
    )
}

export default Container

