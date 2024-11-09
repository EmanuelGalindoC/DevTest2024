import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import AddPoll from './Components/AddPoll/AddPoll';
function App() {
  return (
    <Router>
      <Routes>
        <Route path= '/' element ={<AddPoll/>} />
      </Routes>
    </Router>
      
  );
}

export default App;
