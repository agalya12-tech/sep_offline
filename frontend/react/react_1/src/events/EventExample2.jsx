import React from 'react'

const EventExample2 = () => {
      let[color,setColor]=React.useState(false);
    let s1={
        border:'4px dotted black',
        width:'400px',
        height:'400px',
        margin:'20px',
        backgroundColor:color?'green':'red'
    }
    // function handleMouseEnter(){
    //     setColor(true);
    // }
    function handleMouseLeave(){ 
        setColor(false);
    }
    return (
        <>
         <div style={s1}
         onMouseEnter={()=>setColor(true)}
         onMouseLeave={handleMouseLeave}
         ></div>


        </>
    )
}

export default EventExample2