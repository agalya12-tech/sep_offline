import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.bundle.min.js'

import App from './App.jsx'
import { jsx } from 'react/jsx-runtime'
import FunctionalComponent from './components/Functional.jsx'
import ClassComponent from './components/ClassComponent.jsx'
import State from './hooks/State.jsx'
import Parent from './props/Parent.jsx'
import Container from './components/Container.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    {/* <App />  */}
    {/* <FunctionalComponent />
    <ClassComponent/> */}
    {/* <State /> */}
    {/* <Parent/> */}
    <Container/>
  </StrictMode>,
)

