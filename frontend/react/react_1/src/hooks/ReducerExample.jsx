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
        case "DECREMENT":return {count:state.count-1};
        default: return state;
    }}
   let [state, dispatch]=useReducer(reducer, {count:0});
   function increment() {dispatch({type:"INCREMENT"});}
   function decrement() {dispatch({type:"DECREMENT"});}
  return (
    <>
     <button className='btn btn-success' onClick={increment}>+</button>
     {state.count}
     <button className='btn btn-danger' onClick={decrement}>-</button>
    </>
  )}
export default ReducerExample