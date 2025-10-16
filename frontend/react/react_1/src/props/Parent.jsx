import React from 'react'
import Child from './Child'

const Parent = () => {

    let data="hello";
    return (
        <>
            <div>Parent</div>
            <Child key={data} />
        </>
    )
}

export default Parent