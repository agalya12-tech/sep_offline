import React from 'react';
import './App.css' //external css

function App() {
  let style={ // inline css
    color:'red',
    backgroundColor:'yellow',
  }
  return (
    // <React.Fragment>    --- encapsulating multiple elements
    // <> fragment shorthand
    <div> 
      <h1 style={{color:'red',backgroundColor:'yellow'}}>Hello World</h1> 
      <h1 style={style}>Hello JS</h1>
    </div>
    // </>
    // </React.Fragment> 
  )

}
export default App;


//  index.html--div with id root----->main.jsx ---->App