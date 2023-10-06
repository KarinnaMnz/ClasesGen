import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
//import App from './App';
import reportWebVitals from "./reportWebVitals";
import Boton from "./Boton.js";
const Keys = () => {
  return [1, 2, 3, 4];
};

const root = ReactDOM.createRoot(document.getElementById("root"));

root.render(
  <React.StrictMode>
    <main>
      {Keys().map((Key, index) => (
        <Boton id={Key} />
      ))}
    </main>
  </React.StrictMode>
  // <div><header>Cohorte 7</header>
  // <main>
  // <button data-id="1">Me gusta</button>
  // <button data-id="2">Me gusta</button>
  // <button data-id="3">Me gusta</button></main>
  // <footer>@Wius</footer>
  // </div>
  /* <React.StrictMode>
    <App />
  </React.StrictMode> */
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
