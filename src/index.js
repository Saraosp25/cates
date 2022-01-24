import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App/index';


ReactDOM.render(
 
    //<App saludo="Hola Sara"/>,se pone en app el nombre de la variable como  {props.saludo}
    
    //Para este caso se usa children->
  /*       <App>
          Holaaaa

        </App>, */

        <App/>,
  
  document.getElementById('root')
);


