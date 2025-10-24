import React from 'react'
                                    // User
export const HigherOrderExample = (User) => {
  return  function(props){
    return(
        <>
        <h1>Higher Order Component</h1>
        <User {...props}  name={"Rahul"} age={24} phone={1234567890}/>
        </>
    )
  }
}
