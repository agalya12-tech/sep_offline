import React from 'react'

const GrandFather = () => {
    let p1='banglore property';
  return (
    <><Father p1={p1} /></>
  )
}
const Father = (props) => {
  return (
    <Son p1={props.p1} />
  )
}
const Son = (props) => {
  return (
    <GrandSon p1={props.p1} />
  )
}
const GrandSon = (props) => {
  return (
    <>
    <h1>{props.p1}</h1>
    </>
  )
}
