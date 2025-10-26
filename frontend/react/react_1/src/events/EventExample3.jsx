import React from 'react'

export const EventExample3 = () => {

//    let[items,setItems]=React.useState([]);
    let[items,setItems]=React.useState(null);

    let container = {
        display: 'flex',
        justifyContent: 'center',
    }
    let item = {
        height: '50px',
        width: '50px',
        backgroundColor: 'green',
        margin: '10px',
        padding: '3px',
        color: 'white',
    }
    let droppable = {
        border: '4px dotted black',
    }
    
    function handleDragOver(e){
        e.preventDefault();
    }
    function handleDrop(e){
        e.preventDefault();
        let data=e.dataTransfer.getData('text/plain');
        // setItems([...items,data]);
        setItems(data);
    }
    function handleDragStart(e){
        e.dataTransfer.setData('text/plain',e.target.innerText);
    }
    return (
        <>
            <h1>Drag and Drop Example</h1>
            <div style={container}>
                <div style={item} draggable onDragStart={handleDragStart} >Item 1</div>
                <div style={item} draggable onDragStart={handleDragStart}>Item 2</div>
                <div style={item} draggable onDragStart={handleDragStart}>Item 3</div>
            </div>
            <div style={droppable}
            onDragOver={handleDragOver}
            onDrop={handleDrop}
            >Drop Here
            {
                items && <div>{items}</div>
                // items.map(
                //     (item,index)=>{
                //         return <div key={index} >{item}</div>
                //     }
                // )
            }
            
            </div>
        </>
    )
}
