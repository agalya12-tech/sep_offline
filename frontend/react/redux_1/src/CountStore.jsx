import {createStore} from 'redux';
import {configureStore} from '@reduxjs/toolkit';
function reducer(state={count:0},action){
    switch(action.type){
        case "INCREMENT": return {count:state.count+1};
        case "DECREMENT":return {count:state.count-1};
        default: return state;
    }
}
// export const countStore=createStore(reducer);
export const countStore=configureStore({reducer});
