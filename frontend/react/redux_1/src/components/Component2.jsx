import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
const Component2 = () => {
       let dispatch=useDispatch();
       let count=useSelector(state=>state.count);
    function increment(){
        dispatch({type:"INCREMENT"});
    }
    function decrement(){
        dispatch({type:"DECREMENT"});
    }
    function decrementBy2S(){
        setTimeout(() => {
            dispatch({type:"DECREMENT"});
        }, 2000);
    }
  return (
   <>
    <h1>Component 2 Count : {count}</h1>
    <button className='btn btn-success' onClick={increment}>+</button>
    <button className='btn btn-danger' onClick={decrement}>-</button>
    <button className='btn btn-danger' onClick={decrementBy2S} >Decrement By 2s</button>
   </>
  )
}

export default Component2