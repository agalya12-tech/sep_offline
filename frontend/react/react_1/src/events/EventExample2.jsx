import React from 'react'

const EventExample2 = () => {
      let[color,setColor]=React.useState('red');
    let s1={
        border:'4px dotted black',
        width:'400px',
        height:'400px',
        margin:'20px',
        backgroundColor:color
    }
    // function handleMouseEnter(){
    //     setColor(true);
    // }
    function handleMouseLeave(){ 
        setColor('red');
    }
    return (
        <>
         <div style={s1}
         onMouseEnter={()=>setColor('green')}
         onMouseLeave={handleMouseLeave}
         ></div>


        </>
    )
}

export default EventExample2