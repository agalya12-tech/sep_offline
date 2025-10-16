import { useState } from "react";

const State = () => {
    const [count, setCount] = useState(0);
    function increment() {
        setCount(count + 1);
    }
    function decrement() {
        setCount(count - 1);
    }
    return (
        <>
            <div>State Example</div>
            <button className="btn btn-danger" onClick={decrement}>-</button>{count}
            <button className="btn btn-success" onClick={increment}>+</button>
        </>
    )
}
export default State