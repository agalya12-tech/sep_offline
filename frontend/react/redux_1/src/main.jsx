import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import Component1 from './components/Component1.jsx'
import Component2 from './components/Component2.jsx'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.bundle.min.js'
import { Provider } from 'react-redux'
import { countStore } from './CountStore.jsx'
createRoot(document.getElementById('root')).render(
  <StrictMode>
    {/* <App /> */}
   <Provider store={countStore}>
    <Component1/>
    <Component2/>
   </Provider>

  </StrictMode>,
)
