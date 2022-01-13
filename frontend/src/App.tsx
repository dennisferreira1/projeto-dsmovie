import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Listagem from "pages/Listagem";
import Form from 'pages/Form';
import NavBar from "componentes/NavBar";

function App() {
  return (
    <BrowserRouter>
      <NavBar />
      <Routes>
        <Route path="/" element={<Listagem />} />
        <Route path="/form">
          <Route path=":movieId" element={<Form />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
