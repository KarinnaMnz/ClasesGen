import Header from "./component/Header";
import Main from "./component/Main";
import Footer from "./component/Footer";
import PostForm from "./component/PostForm";

const ConfigPage = {
  titulo: "Cohorte 7",
  autor: "@Javier",
  anio: "2023",
};
const MiMain = () => {
  return <h1>Hola gatos</h1>;
};

export default function app() {
  return (
    <>
      <Header titulo={ConfigPage.titulo} anio={ConfigPage.anio} />
      <Main>
        <MiMain />
        {/* 1° hijo del render index.js , pasando otro componente como propiedad "Children"*/}
        <PostForm />
      </Main>
      <Footer autor={ConfigPage.autor} />
    </>
  );
}
