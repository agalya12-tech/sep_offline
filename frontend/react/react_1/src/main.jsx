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
import GrandFather from './props/context/FamilyTree.jsx'
import LoginPage from './props/context/AuthApplication.jsx'
import Controlled from './components/Controlled.jsx'
import UnControlled from './components/UnControlled.jsx'
import PureComponentExample from './components/PureComponentExample.jsx'
import { HigherOrderExample } from './components/HigherOrderExample.jsx'
import User from './components/User.jsx'
import EventExample1 from './events/EventExample1.jsx'
// import GrandFather from './props/PropsDrilling.jsx'

const HigherOrderComponent=HigherOrderExample(User);
createRoot(document.getElementById('root')).render(
  <StrictMode>
    <EventExample1/>

    
    {/* <HigherOrderComponent/> */}
    {/* <App />  */}
    {/* <FunctionalComponent />
    <ClassComponent/> */}
    {/* <State /> */}
    {/* <Parent/> */}
    {/* <Container/> */}
    {/* <GrandFather/> */}
    {/* <GrandFather/> */}
    {/* <LoginPage/> */}
    {/* <Controlled/> */}
    {/* <UnControlled/> */}
    {/* <PureComponentExample/> */}
  </StrictMode>,
)

