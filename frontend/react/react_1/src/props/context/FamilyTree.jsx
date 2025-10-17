import { useContext } from "react";
import { FamilyContext } from "./FamilyContext";

const GrandFather = () => {
    let p1='banglore property';
  return (
    <>
    <h1>GrandFather Component</h1>
   <FamilyContext.Provider value={p1}>
    <Father  />
   </FamilyContext.Provider>
    
    </>
  )
}

const Father = () => {
  return (
    <>
    <h1>Father Component</h1>
     <Son  />
    </>
  )
}

const Son = () => {
  return (
   <>
    <h1>Son Component</h1>
    <GrandSon  />
   </>
  )
}
const GrandSon = () => {
     const p1=useContext(FamilyContext)
  return (
    <>
    <h1>Grand Son Component</h1>
    <p>{p1} in grandson</p>
    </>
  )
}
export default GrandFather;