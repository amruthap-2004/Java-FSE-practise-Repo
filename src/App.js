import React, { Suspense, lazy } from 'react';
import './App.css';

// Lazy load components for better bundle splitting
const Home = lazy(() => import('./components/Home'));
const About = lazy(() => import('./components/About'));
const Contact = lazy(() => import('./components/Contact'));

function App() {
  return (
    <div className="container">
      <Suspense fallback={<div>Loading...</div>}>
        <Home/>
        <About/>
        <Contact/>
      </Suspense>
    </div>
  );
}

export default App;
