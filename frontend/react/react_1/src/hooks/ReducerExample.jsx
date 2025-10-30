// import React, { useState } from 'react'
// const ReducerExample = () => {
//     let [count, setCount] = useState(0);
//     function increment() {
//         setCount(count + 1);
//     }
//     function decrement() {
//         setCount(count - 1);
//     }
//     return (
//         <>
//             <button className='btn btn-success' onClick={increment} >+</button>
//             {count}
//             <button className='btn btn-danger' onClick={decrement}>-</button>
//         </>
//     )
// }
// export default ReducerExample



import React, { useReducer } from 'react'

const ReducerExample = () => {
   function reducer(state, action) {
    switch(action.type){
        case "INCREMENT": return {count:state.count+1};
        case "INCREMENTBY5": return {count:state.count+5};
        case "DECREMENT":return {count:state.count-1};
        default: return state;
    }}
   let [state, dispatch]=useReducer(reducer, {count:0});
   function increment() {dispatch({type:"INCREMENT"});}
   function incrementBy5() {dispatch({type:"INCREMENTBY5"});}
   function decrement() {dispatch({type:"DECREMENT"});}
   function decrementBy2s() {
    setTimeout(() => {
        dispatch({type:"DECREMENT"});
    }, 2000);
   }
  return (
    <>
     {state.count} <br/>
     <button className='btn btn-danger' onClick={decrementBy2s}>Decrement By 2s</button>
     <button className='btn btn-danger' onClick={decrement}>-</button>
     <button className='btn btn-success' onClick={increment}>+</button>
     <button className='btn btn-success' onClick={incrementBy5}>Increment By 5</button>
    </>
  )}
export default ReducerExample