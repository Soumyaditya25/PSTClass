import React, { useState } from 'react'

const App = () => {
  const[count, setCount]=useState(0);
  function increament(){
    setCount(count+1);
  }
  function decreament(){
    setCount(count-1);
  }
  return (
    <>
    <App2 />
    <div >{count}</div>
    <button onClick={increament}>Click Me +</button>
    <button onClick={decreament}>Click Me -</button>
    </>

  )
}


const App2 = () => (
  <>
    <div>
      <h1>Anshuman kah ( . ) ( . ) kah size</h1>
    </div>
  </>
)

export default App