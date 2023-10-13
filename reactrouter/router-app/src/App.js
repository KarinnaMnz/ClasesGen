import "./App.css";
import { Link, Route, Routes } from "react-router-dom";

const Inicio = () => {
  return <h1>Inicio</h1>;
};
const Pagina = () => <h1>Página</h1>;
const Tienda = () => <h1>Tienda</h1>;

function App() {
  return (
    <>
      <header style={{ backgroundColor: "#7173D1" }}>
        <div className="App">Hola Cohorte 7!</div>
        <ul>
          <li>
            <Link href="/">Inicio</Link>
          </li>
          <li>
            <Link href="/pagina">Página</Link>
          </li>
          <li>
            <Link href="/tienda">Tienda</Link>
          </li>
        </ul>
      </header>
      <Routes>
        {""}
        {/* <switch> */}
        <Route path="/" element={<Inicio />} />
        <Route path="/pagina" element={<Pagina />} />
        <Route path="/tienda" element={<Tienda />} />
      </Routes>
    </>
  );
}

export default App;
