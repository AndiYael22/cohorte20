import { render, screen } from '@testing-library/react';
import App from './App';
import "./App.css";
import MiComponente from "./MiComponente";
function App(){
  return(
    <div className='App'>
      <header className='App-header'>
      <img src{logo} className="App-logo" alt='logo'/>
      <p>
        Edit <code> src/App</code>and save to reload
        <p/>
        <MiComponente></MiComponente>
        </header>
        </div>
  );
}