import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
const Component1 = () => {
       let dispatch=useDispatch();
       let count=useSelector(state=>state.count);
    function increment(){
        dispatch({type:"INCREMENT"});
    }
    function decrement(){
        dispatch({type:"DECREMENT"});
    }
    function incrementBy2s(){
        setTimeout(() => {
            dispatch({type:"INCREMENT"});
        }, 2000);
    }
  return (
   <>
    <h1>Component 1 Count : {count}</h1>
    <button className='btn btn-success' onClick={incrementBy2s} >Increment By 2s</button>
    <button className='btn btn-success' onClick={increment}>+</button>
    <button className='btn btn-danger' onClick={decrement}>-</button>
   </>
  )
}

export default Component1