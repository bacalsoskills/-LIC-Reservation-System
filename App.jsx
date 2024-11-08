import React from 'react';
import './App.css';
import StudentList from './StudentList';

function App() {
  return (
    <div className="App">
      <header>
        <h1>LIC Reservation System</h1>
      </header>
      <main>
        <StudentList />
      </main>
    </div>
  );
}

export default App;
