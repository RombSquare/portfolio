import React from 'react'
import './App.css';
import Drawer from 'react-modern-drawer'
import 'react-modern-drawer/dist/index.css'

function App() {
  const [isOpen, setIsOpen] = React.useState(false)
  const toggleDrawer = () => {
      setIsOpen((prevState) => !prevState)
  }

  return (
    <div className="App">
      <>
          <button onClick={toggleDrawer}>Show</button>
          <Drawer
              open={isOpen}
              onClose={toggleDrawer}
              direction='left'
              className='drawer'
          >
              <div style={{ padding: "20px", display: "flex", flexDirection: "column", gap: "20px" }}>
                <h2>Drawer Content</h2>
                <div onClick={() => alert("Button 1 clicked!")}>Button 1</div>
                <div onClick={() => alert("Button 2 clicked!")}>Button 2</div>
                <div onClick={toggleDrawer}>Close Drawer</div>
              </div>
          </Drawer>
      </>

      <main>
        <h1>Volodymyr</h1>
        <h3>Flutter & Native Android</h3>
        <div className="ButtonRow">
          <button>My projects</button>
          <button>Hire me</button>
        </div>
      </main>
    </div>
  );
}

export default App;
