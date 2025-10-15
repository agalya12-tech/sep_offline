import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import { jsx } from 'react/jsx-runtime'
import FunctionalComponent from './components/Functional.jsx'
import ClassComponent from './components/ClassComponent.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    {/* <App />  */}
    <FunctionalComponent />
    <ClassComponent/>
  </StrictMode>,
)

