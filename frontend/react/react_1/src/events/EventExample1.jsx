import React from 'react'

const EventExample1 = () => {

    function handleClick() {
        alert("button clicked")
    }


    function handleClick2(name) {
        alert("button clicked " + name) 

    }

    return (
        <>
            <button onClick={() => { alert("button clicked") }} >Click Me</button>


            <button onDoubleClick={handleClick}>Click Me </button>

            <button onDoubleClick={()=>{handleClick2('Rahul')}}>Click Me For Name </button>

        </>
    )
}

export default EventExample1